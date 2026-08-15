package dbconnection;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class DBGUI extends JFrame implements ActionListener{
	
	JTextArea queryArea;
    JButton executeButton;
    JTable table;
    DefaultTableModel model;
    
    Connection con;
    Statement stmt;
    
    public DBGUI() {
        setTitle("SQL Query Executor");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Query input area
        queryArea = new JTextArea(4, 50);
        JScrollPane queryScroll = new JScrollPane(queryArea);

        // Execute button
        executeButton = new JButton("Execute Query");
        executeButton.addActionListener(this);

        // Top panel
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(queryScroll, BorderLayout.CENTER);
        topPanel.add(executeButton, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);

        // Table
        model = new DefaultTableModel();
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Database connection
        connectDatabase();

        setVisible(true);
    }

    public void connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "hemraj@5807");

            stmt = con.createStatement();

            JOptionPane.showMessageDialog(this,
                "Database Connected Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Connection Error: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String query = queryArea.getText();

        try {
            model.setRowCount(0);
            model.setColumnCount(0);

            if (query.trim().toLowerCase().startsWith("select")) {

                ResultSet rs = stmt.executeQuery(query);
                ResultSetMetaData md = rs.getMetaData();

                int cols = md.getColumnCount();

                // Column names
                for (int i = 1; i <= cols; i++) {
                    model.addColumn(md.getColumnName(i));
                }

                // Rows
                while (rs.next()) {
                    Object[] row = new Object[cols];
                    for (int i = 1; i <= cols; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }

            } else {
                int rows = stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,
                    rows + " row(s) affected.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Error: " + e.getMessage());
        }
    }

	
	
	
     public static void main(String[] args) {
         new DBGUI();
      }

}
