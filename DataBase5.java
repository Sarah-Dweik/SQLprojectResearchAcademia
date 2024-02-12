
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataBase5 extends Application {
	Operations3 operations = new Operations3();

	public void start(Stage arg0) throws Exception {

		//
		BorderPane root = new BorderPane();
		MenuBar mbar = new MenuBar();

		Menu menu1 = new Menu("Employee");
		Menu menu2 = new Menu("Event");
		Menu menu3 = new Menu("Dep");
		Menu menu4 = new Menu("HasTools");
		Menu menu5 = new Menu("Labs");
		Menu menu6 = new Menu("Rpublish");
		Menu menu7 = new Menu("Use");
		Menu menu8 = new Menu("WorkIn");
		Menu menu9 = new Menu("Write");
		Menu menu10 = new Menu("Participate");
		Menu menu11 = new Menu("Phone");

		// Create new menu items for each menu
		MenuItem menu1Item1 = new MenuItem("INSERT");
		MenuItem menu1Item2 = new MenuItem("UPDATE");
		MenuItem menu1Item3 = new MenuItem("DELETE");

		MenuItem menu2Item1 = new MenuItem("INSERT");
		MenuItem menu2Item2 = new MenuItem("UPDATE");
		MenuItem menu2Item3 = new MenuItem("DELETE");

		MenuItem menu3Item1 = new MenuItem("INSERT");
		MenuItem menu3Item2 = new MenuItem("UPDATE");
		MenuItem menu3Item3 = new MenuItem("DELETE");

		MenuItem menu4Item1 = new MenuItem("INSERT");
		MenuItem menu4Item2 = new MenuItem("UPDATE");
		MenuItem menu4Item3 = new MenuItem("DELETE");

		MenuItem menu5Item1 = new MenuItem("INSERT");
		MenuItem menu5Item2 = new MenuItem("UPDATE");
		MenuItem menu5Item3 = new MenuItem("DELETE");

		MenuItem menu6Item1 = new MenuItem("INSERT");
		MenuItem menu6Item2 = new MenuItem("UPDATE");
		MenuItem menu6Item3 = new MenuItem("DELETE");

		MenuItem menu7Item1 = new MenuItem("INSERT");
		MenuItem menu7Item2 = new MenuItem("UPDATE");
		MenuItem menu7Item3 = new MenuItem("DELETE");

		MenuItem menu8Item1 = new MenuItem("INSERT");
		MenuItem menu8Item2 = new MenuItem("UPDATE");
		MenuItem menu8Item3 = new MenuItem("DELETE");

		MenuItem menu9Item1 = new MenuItem("INSERT");
		MenuItem menu9Item2 = new MenuItem("UPDATE");
		MenuItem menu9Item3 = new MenuItem("DELETE");

		MenuItem menu10Item1 = new MenuItem("INSERT");
		MenuItem menu10Item2 = new MenuItem("UPDATE");
		MenuItem menu10Item3 = new MenuItem("DELETE");

		MenuItem menu11Item1 = new MenuItem("INSERT");
		MenuItem menu11Item2 = new MenuItem("UPDATE");
		MenuItem menu11Item3 = new MenuItem("DELETE");

		// Add the menu items to the respective menus
		menu1.getItems().addAll(menu1Item1, menu1Item2, menu1Item3);
		menu2.getItems().addAll(menu2Item1, menu2Item2, menu2Item3);
		menu3.getItems().addAll(menu3Item1, menu3Item2, menu3Item3);
		menu4.getItems().addAll(menu4Item1, menu4Item2, menu4Item3);
		menu5.getItems().addAll(menu5Item1, menu5Item2, menu5Item3);
		menu6.getItems().addAll(menu6Item1, menu6Item2, menu6Item3);
		menu7.getItems().addAll(menu7Item1, menu7Item2, menu7Item3);
		menu8.getItems().addAll(menu8Item1, menu8Item2, menu8Item3);
		menu9.getItems().addAll(menu9Item1, menu9Item2, menu9Item3);
		menu10.getItems().addAll(menu10Item1, menu10Item2, menu10Item3);
		menu11.getItems().addAll(menu11Item1, menu11Item2, menu11Item3);

		// Add the menus to the menu bar
		mbar.getMenus().addAll(menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8, menu9, menu10, menu11);

		// insert
		menu1Item1.setOnAction(e -> {
			root.setLeft(operations.employeesTable());
		});

		menu11Item1.setOnAction(e -> {
			root.setLeft(operations.phoneTable());
		});

		menu2Item1.setOnAction(e -> {
			root.setLeft(operations.eventTable());
		});

		menu3Item1.setOnAction(e -> {
			root.setLeft(operations.departmentTable());
		});

		menu4Item1.setOnAction(e -> {

			root.setLeft(operations.hasToolsTable());
		});

		menu5Item1.setOnAction(e -> {
			root.setLeft(operations.labs());
		});

		menu6Item1.setOnAction(e -> {
			root.setLeft(operations.researchPublish());
		});
		menu7Item1.setOnAction(e -> {
			root.setLeft(operations.use());
		});
		menu8Item1.setOnAction(e -> {
			root.setLeft(operations.WorkIn());
		});
		menu9Item1.setOnAction(e -> {
			root.setLeft(operations.write());
		});
		menu10Item1.setOnAction(e -> {
			root.setLeft(operations.participate());
		});

		///////////////////////
		// update
		menu1Item2.setOnAction(e -> {
			root.setLeft(operations.updateEmployees());
		});

		menu2Item2.setOnAction(e -> {
			root.setLeft(operations.updateeventTable());
		});

		menu3Item2.setOnAction(e -> {
			root.setLeft(operations.updateDepartment());
		});

		menu4Item2.setOnAction(e -> {
			root.setLeft(operations.updatehasToolsTable());
		});

		menu5Item2.setOnAction(e -> {
			root.setLeft(operations.updatlabs());
		});

		menu6Item2.setOnAction(e -> {
			root.setLeft(operations.updateresearchPublish());
		});
		menu7Item2.setOnAction(e -> {
			root.setLeft(operations.Updateuse());
		});
		menu8Item2.setOnAction(e -> {
			root.setLeft(operations.updateWorkIn());
		});
		menu9Item2.setOnAction(e -> {
			root.setLeft(operations.updatewrite());
		});
		menu10Item2.setOnAction(e -> {
			root.setLeft(operations.updateparticipate());
		});

		///////////////////////
		// delete
		menu1Item3.setOnAction(e -> {
			root.setLeft(operations.delEmployees());
		});

		menu2Item3.setOnAction(e -> {
			root.setLeft(operations.delEvent());
		});

		menu3Item3.setOnAction(e -> {
			root.setLeft(operations.delDepartment());
		});

		menu4Item3.setOnAction(e -> {
			root.setLeft(operations.delHasTools());
		});

		menu5Item3.setOnAction(e -> {
			root.setLeft(operations.delLabs());
		});

		menu6Item3.setOnAction(e -> {
			root.setLeft(operations.delResearch());
		});
		menu7Item3.setOnAction(e -> {
			root.setLeft(operations.delUse());
		});
		menu8Item3.setOnAction(e -> {
			root.setLeft(operations.delWork_in());
		});
		menu9Item3.setOnAction(e -> {
			root.setLeft(operations.delWrite());
		});
		menu10Item3.setOnAction(e -> {
			root.setLeft(operations.participate());
		});

		root.setTop(mbar);

		Button bt1 = new Button("CHOOSE TABLE");
		/*
		 * bt1.setOnAction(e -> { operations.chooseTable(); });
		 */
		VBox pane = new VBox();
		pane.getChildren().addAll(root);
		Scene scene = new Scene(pane, 650, 400);
		arg0.setScene(scene);
		arg0.show();
		arg0.setTitle(" CHOOSE TABLE ");
	}

	public static void main(String[] args) {

		launch(args);
	}
}

class Operations3 {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/project-phase3";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "99InDataStructure";

	// Tables
	public VBox employeesTable() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("ename");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("wage");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		TextField tx4 = new TextField();
		Label lb4 = new Label("degree");
		HBox b4 = new HBox();
		b4.getChildren().addAll(lb4, tx4);

		TextField tx5 = new TextField();
		Label lb5 = new Label("role");
		HBox b5 = new HBox(10);
		b5.getChildren().addAll(lb5, tx5);

		VBox pane = new VBox(10);
		pane.setAlignment(Pos.CENTER);
		pane.getChildren().addAll(b1, b2, b3, b4, b5, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String eid = tx1.getText();
				String ename = tx2.getText();
				int wage = Integer.valueOf(tx3.getText());
				String degree = tx4.getText();
				String role = tx5.getText();

				// make them of one String to pass them to the insert method
				String columnsvalues = eid + "," + ename + "," + wage + "," + degree + "," + role;
				String columnNames = "eid, ename, wage, degree, role";
				performInsertion("employees", columnNames, columnsvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox phoneTable() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid13");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("phone");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, bt);

		bt.setOnAction(e -> {
			try {

				String eid13 = tx1.getText();
				String phone = tx2.getText();
				String columnvalues = eid13 + "," + phone;
				String columnnames = "eid13, phone";
				performInsertion("phone", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;

	}

	public VBox departmentTable() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("did");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("dname");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx6 = new TextField();
		Label lb6 = new Label("contact");
		HBox b6 = new HBox();
		b6.getChildren().addAll(lb6, tx6);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, b6, bt);

		bt.setOnAction(e -> {
			try {

				String did = tx1.getText();
				String dname = tx2.getText();
				String contact = tx6.getText();

				String columnvalues = did + "," + dname + "," + contact;
				String columnnames = "did, dname, contact";

				performInsertion("department", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;

	}

	public VBox eventTable() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("vid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("location");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("type");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, b3, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String vid = tx1.getText();
				String location = tx2.getText();
				String type = tx3.getText();

				String columnvalues = vid + "," + location + "," + type;
				String columnnames = "vid, location, type";
				performInsertion("event", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox hasToolsTable() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("tid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("lid2");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("tool name");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, b3, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String tid = tx1.getText();
				String lid = tx2.getText();
				String toolName = tx2.getText();

				String columnvalues = tid + "," + lid + "," + toolName;
				String columnnames = "tid, lid2, toolname";
				performInsertion("hastools", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox labs() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("lid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("lab name");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String lid = tx1.getText();
				String lname = tx2.getText();
				String columnvalues = lid + "," + lname;
				String columnnames = "lid, lname";
				performInsertion("labs", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox participate() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("vid1");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid3");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String vid1 = tx1.getText();
				String eid3 = tx2.getText();
				String columnvalues = vid1 + "," + eid3;
				String columnnames = "vid1, eid3";
				performInsertion("participate", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox researchPublish() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("topic");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("rname");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("did12");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		TextField tx4 = new TextField();
		Label lb4 = new Label("rid");
		HBox b4 = new HBox();
		b4.getChildren().addAll(lb4, tx4);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, b3, b4, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String topic = tx1.getText();
				String rname = tx2.getText();
				String did12 = tx3.getText();
				String rid = tx4.getText();

				String columnvalues = topic + "," + rname + "," + did12 + "," + rid;
				String columnnames = "topic, rname, did12, rid";
				performInsertion("researchpublish", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox use() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("lid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid5");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String lid1 = tx1.getText();
				String eid5 = tx2.getText();

				String columnvalues = lid1 + "," + eid5;
				String columnnames = "lid1, eid5";
				performInsertion("uselab", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox WorkIn() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("since");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid11");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("did11");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, b3, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String sinceyear = tx1.getText();
				String eid11 = tx2.getText();
				String did11 = tx3.getText();

				String columnvalues = sinceyear + "," + eid11 + "," + did11;
				String columnnames = "sinceyear, eid11, did11";
				performInsertion("workin", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	public VBox write() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid12");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("rid1");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String eid12 = tx1.getText();
				String rid2 = tx2.getText();

				String columnvalues = eid12 + "," + rid2;
				String columnnames = "eid12, rid2";
				performInsertion("writeresearch", columnnames, columnvalues);
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		// stage.setScene(scene);
		// stage.show();
		return pane;
	}

	private void performInsertion(String tableName, String columnNames, String columnValues) {
		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
			String sql = "INSERT INTO " + tableName + " (" + columnNames + ") VALUES (";

			String[] values = columnValues.split(",");
			for (int i = 0; i < values.length; i++) {
				sql += "?,";
			}
			sql = sql.substring(0, sql.length() - 1) + ")";

			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				for (int i = 0; i < values.length; i++) {
					pstmt.setString(i + 1, values[i].trim()); // Binding string values
				}
				pstmt.executeUpdate();
				System.out.println("Data inserted successfully into " + tableName + " table!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public VBox delEmployees() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("ename");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("wage");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		TextField tx4 = new TextField();
		Label lb4 = new Label("degree");
		HBox b4 = new HBox();
		b4.getChildren().addAll(lb4, tx4);

		TextField tx5 = new TextField();
		Label lb5 = new Label("role");
		HBox b5 = new HBox();
		b5.getChildren().addAll(lb5, tx5);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, b3, b4, b5, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the san,me as set in the SQL
				String eid = tx1.getText();
				String ename = tx2.getText();
				String wage = tx3.getText();
				String degree = tx4.getText();
				String role = tx5.getText();
				if (!tx1.getText().isEmpty()) {
					deleteRecords("employees", "eid", eid);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("employees", "ename", ename);
				}
				if (!tx3.getText().isEmpty()) {
					deleteRecords("employees", "wage", wage);
				}
				if (!tx4.getText().isEmpty()) {
					deleteRecords("employees", "degree", degree);
				}
				if (!tx5.getText().isEmpty()) {
					deleteRecords("employees", "role", role);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	public VBox delEvent() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("vid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("type");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("location");
		HBox b3 = new HBox();
		b2.getChildren().addAll(lb3, tx3);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, b3, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the san,me as set in the SQL
				String vid = tx1.getText();
				String type = tx2.getText();
				String location = tx3.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("event", "vid", vid);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("event", "type", type);
				}
				if (!tx3.getText().isEmpty()) {
					deleteRecords("event", "location", location);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	public VBox delParticipate() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid3");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("vid1");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String eid3 = tx1.getText();
				String vid1 = tx2.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("participate", "eid3", eid3);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("participate", "vid1", vid1);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	public VBox delDepartment() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("did");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("dname");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String did = tx1.getText();
				String dname = tx2.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("department", "did", did);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("department", "dname", dname);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	//
	public VBox delHasTools() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("tid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("lid2");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("tool name");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, b3, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String tid = tx1.getText();
				String lid2 = tx2.getText();
				String toolName = tx3.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("has-tools", "tid", tid);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("has-tools", "lid2", lid2);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("has-tools", "tool name", toolName);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	public VBox delLabs() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("lid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("lname");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String lid = tx1.getText();
				String lname = tx2.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("labs", "tid", lid);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("labs", "lid2", lname);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	public VBox delResearch() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("rid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("did12");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("rname");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb1, tx1);

		TextField tx4 = new TextField();
		Label lb4 = new Label("topic");
		HBox b4 = new HBox();
		b4.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, b3, b4, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String rid = tx1.getText();
				String did12 = tx2.getText();
				String rname = tx2.getText();
				String topic = tx2.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("researchpublish", "rid", rid);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("researchpublish", "did12", did12);
				}
				if (!tx1.getText().isEmpty()) {
					deleteRecords("researchpublish", "rname", rname);
				}
				if (!tx1.getText().isEmpty()) {
					deleteRecords("researchpublish", "topic", topic);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();

	}

	public VBox delUse() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid5");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("lid1");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String eid5 = tx1.getText();
				String lid1 = tx2.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("use", "eid5", eid5);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("use", "lid1", lid1);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	public VBox delWork_in() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("did11");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid11");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("since");
		HBox b3 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, b3, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String did11 = tx1.getText();
				String eid11 = tx2.getText();
				String since = tx2.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("work-in", "did11", did11);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("work-in", "eid11", eid11);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("work-in", "since", since);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	public VBox delWrite() {
		Stage stage = new Stage();
		Button bt = new Button("Done");
		Label message = new Label("Enter only the value that you want to delete based on");

		TextField tx1 = new TextField();
		Label lb1 = new Label("rid2");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid12");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane = new VBox();
		pane.getChildren().addAll(message, b1, b2, bt);

		bt.setOnAction(e -> {
			try {
				// the read type is the same as set in the SQL
				String rid2 = tx1.getText();
				String eid12 = tx2.getText();

				if (!tx1.getText().isEmpty()) {
					deleteRecords("write", "rid2", rid2);
				}
				if (!tx2.getText().isEmpty()) {
					deleteRecords("write", "eid12", eid12);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
		// stage.setScene(scene);
		// stage.show();
	}

	private void deleteRecords(String tableName, String fieldName, String value) {
		String sql = "DELETE FROM " + tableName + " WHERE " + fieldName + " = ?";

		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, value);
			int affectedRows = pstmt.executeUpdate();
			System.out.println("Deleted " + affectedRows + " records from " + tableName + " table.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public VBox updateEmployees() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("DONE");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("ename");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("wage");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		TextField tx4 = new TextField();
		Label lb4 = new Label("degree");
		HBox b4 = new HBox();
		b4.getChildren().addAll(lb4, tx4);

		TextField tx5 = new TextField();
		Label lb5 = new Label("role");
		HBox b5 = new HBox();
		b5.getChildren().addAll(lb5, tx5);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2, b3, b4, b5);

		TextField tx11 = new TextField();
		Label lb11 = new Label("eid");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("ename");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		TextField tx33 = new TextField();
		Label lb33 = new Label("wage");
		HBox b33 = new HBox();
		b33.getChildren().addAll(lb33, tx33);

		TextField tx44 = new TextField();
		Label lb44 = new Label("degree");
		HBox b44 = new HBox();
		b44.getChildren().addAll(lb44, tx44);

		TextField tx55 = new TextField();
		Label lb55 = new Label("role");
		HBox b55 = new HBox();
		b55.getChildren().addAll(lb55, tx55);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22, b33, b44, b55);

		bt.setOnAction(e -> {
			String eidToUpdate = tx1.getText();
			String enameToUpdate = tx2.getText();
			String wageToUpdate = tx3.getText();
			String degreeToUpdate = tx4.getText();
			String roleToUpdate = tx5.getText();

			String accordingToeid = tx11.getText();
			String accordingToename = tx22.getText();
			String accordingTowage = tx33.getText();
			String accordingTodegre = tx44.getText();
			String accordingTorole = tx55.getText();

			// update eid based on 5 possible values
			if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "eid", eidToUpdate, "eid", accordingToeid);
			}
			if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
				updateRecords("employees", "eid", eidToUpdate, "ename", accordingToename);
			}
			if (!tx1.getText().isEmpty() && !tx33.getText().isEmpty()) {
				updateRecords("employees", "eid", eidToUpdate, "wage", accordingTowage);
			}
			if (!tx1.getText().isEmpty() && !tx44.getText().isEmpty()) {
				updateRecords("employees", "eid", eidToUpdate, "degree", accordingTodegre);
			}
			if (!tx1.getText().isEmpty() && !tx55.getText().isEmpty()) {
				updateRecords("employees", "eid", eidToUpdate, "role", accordingTorole);
			}

			// update ename based on 5 possible values
			if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "ename", enameToUpdate, "eid", accordingToeid);
			}
			if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "ename", enameToUpdate, "ename", accordingToename);
			}
			if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "ename", enameToUpdate, "wage", accordingTowage);
			}
			if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "ename", enameToUpdate, "degree", accordingTodegre);
			}
			if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "ename", enameToUpdate, "role", accordingTorole);
			}

			// update the wage based on 5 possible values
			if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "wage", wageToUpdate, "eid", accordingToeid);
			}
			if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "wage", wageToUpdate, "ename", accordingToename);
			}
			if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "wage", wageToUpdate, "wage", accordingTowage);
			}
			if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "wage", wageToUpdate, "degree", accordingTodegre);
			}
			if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "wage", wageToUpdate, "role", accordingTorole);
			}

			// update the role based on 5 poosible values
			if (!tx4.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "degree", degreeToUpdate, "eid", accordingToeid);
			}
			if (!tx4.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "degree", degreeToUpdate, "ename", accordingToename);
			}
			if (!tx4.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "degree", degreeToUpdate, "wage", accordingTowage);
			}
			if (!tx4.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "degree", degreeToUpdate, "degree", accordingTodegre);
			}
			if (!tx4.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "degree", degreeToUpdate, "role", accordingTorole);
			}

			// update the degree based on 5 possible values
			if (!tx5.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "role", roleToUpdate, "eid", accordingToeid);
			}
			if (!tx5.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "role", roleToUpdate, "ename", accordingToename);
			}
			if (!tx5.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "role", roleToUpdate, "wage", accordingTowage);
			}
			if (!tx5.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "role", roleToUpdate, "degree", accordingTodegre);
			}
			if (!tx5.getText().isEmpty() && !tx11.getText().isEmpty()) {
				updateRecords("employees", "role", roleToUpdate, "role", accordingTorole);
			}

		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);
		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updateDepartment() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		Label lb = new Label("VALUE TO UPDATE");
		TextField tx1 = new TextField();
		Label lb1 = new Label("did");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("dname");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(lb, b1, b2);

		Label label = new Label("ACCORDING TO");

		TextField tx11 = new TextField();
		Label lb11 = new Label("did");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("dname");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		VBox pane2 = new VBox();
		pane1.getChildren().addAll(label, b11, b22);

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		bt.setOnAction(e -> {
			try {

				String didToUpdate = tx1.getText();
				String dnameToUpdate = tx2.getText();
				String accordingTodid = tx11.getText();
				String accordingTodname = tx22.getText();

				// update did based on 2 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("department", "did", didToUpdate, "did", accordingTodid);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("department", "did", didToUpdate, "dname", accordingTodname);
				}
				// update dname based on 2 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("department", "dname", dnameToUpdate, "did", accordingTodid);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("department", "dname", dnameToUpdate, "dname", accordingTodname);
				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updatePhone() {
		Stage stage = new Stage();
		Button bt = new Button("Done");

		Label lb = new Label("VALUE TO UPDATE");
		TextField tx1 = new TextField();
		Label lb1 = new Label("eid13");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("phone");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(lb, b1, b2);

		Label label = new Label("ACCORDING TO");

		TextField tx11 = new TextField();
		Label lb11 = new Label("eid13");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("phone");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		VBox pane2 = new VBox();
		pane1.getChildren().addAll(label, b11, b22);

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		bt.setOnAction(e -> {
			try {

				String eidToUpdate = tx1.getText();
				String phoneToUpdate = tx2.getText();
				
				String accordingToeid = tx11.getText();
				String accordingTophone = tx22.getText();

				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("phone", "eid13", eidToUpdate, "eid13", accordingToeid);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("phone", "eid13", eidToUpdate, "phone", accordingTophone);
				}
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("phone", "phone", phoneToUpdate, "eid13", accordingToeid);

				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("phone", "phone", phoneToUpdate, "phone", accordingTophone);

				}

			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		Scene scene = new Scene(pane);
		return pane;

	}

	public VBox updateeventTable() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("vid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);
		TextField tx2 = new TextField();
		Label lb2 = new Label("location");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);
		TextField tx3 = new TextField();
		Label lb3 = new Label("type");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2, b3);
		TextField tx11 = new TextField();
		Label lb11 = new Label("vid");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("location");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		TextField tx33 = new TextField();
		Label lb33 = new Label("type");
		HBox b33 = new HBox();
		b33.getChildren().addAll(lb33, tx33);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22, b33);

		bt.setOnAction(e -> {
			try {
				String vidToUpdate = tx1.getText();
				String locationToUpdate = tx2.getText();
				String typeToUpdate = tx3.getText();

				String accordingTovid = tx11.getText();
				String accordingTolocation = tx22.getText();
				String accordingTotype = tx33.getText();

				// update vid based on 3 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("event", " vid", vidToUpdate, "vid", accordingTovid);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("event", " vid", vidToUpdate, "location", accordingTolocation);
				}
				if (!tx1.getText().isEmpty() && !tx33.getText().isEmpty()) {
					updateRecords("event", " vid", vidToUpdate, "type", accordingTotype);
				}

				// update location based on 3 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("event", " location", locationToUpdate, "vid", accordingTovid);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("event", " location", locationToUpdate, "location", accordingTolocation);
				}

				if (!tx2.getText().isEmpty() && !tx33.getText().isEmpty()) {
					updateRecords("event", " location", locationToUpdate, "type", accordingTotype);
				}

				// update type based on 3 attribute
				if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("event", " type", typeToUpdate, "vid", accordingTovid);
				}
				if (!tx3.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("event", " type", typeToUpdate, "location", accordingTolocation);
				}

				if (!tx3.getText().isEmpty() && !tx33.getText().isEmpty()) {
					updateRecords("event", " type", typeToUpdate, "type", accordingTotype);
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updatehasToolsTable() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("tid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("lid2");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2);

		TextField tx11 = new TextField();
		Label lb11 = new Label("tid");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("lid2");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb2, tx2);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22);

		bt.setOnAction(e -> {
			try {
				String tidToUpdate = tx1.getText();
				String lid2ToUpdate = tx2.getText();

				String accordingTotid = tx11.getText();
				String accordingTolid2 = tx22.getText();

				// update tid based on 2 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("hasTools", " tid", tidToUpdate, "tid", accordingTotid);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("hasTools", " tid", tidToUpdate, "lid2", accordingTolid2);
				}

				// update lid2 based on 2 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("hasTools", " lid2", lid2ToUpdate, " tid", accordingTotid);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("hasTools", " lid2", lid2ToUpdate, "lid2", accordingTolid2);
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updatlabs() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("lid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("lname");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2);

		TextField tx11 = new TextField();
		Label lb11 = new Label("lid");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("lname");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22);

		bt.setOnAction(e -> {
			try {
				String lidToUpdate = tx1.getText();
				String lnameToUpdate = tx2.getText();

				String accordingTolid = tx11.getText();
				String accordingTolname = tx22.getText();

				// update lid based on 2 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("labs", " lid", lidToUpdate, "lid", accordingTolid);
				}					

				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("labs", " lid", lidToUpdate, "lname", accordingTolname);

				}

				// update lname based on 2 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("labs", " lname", lnameToUpdate, "lid", accordingTolid);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("labs", " lname", lnameToUpdate, " lname", accordingTolname);
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}

		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updateparticipate() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("vid1");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid3");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2);

		TextField tx11 = new TextField();
		Label lb11 = new Label("vid1");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("eid3");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22);

		bt.setOnAction(e -> {
			try {
				String vid1ToUpdate = tx1.getText();
				String eid3ToUpdate = tx2.getText();

				String accordingTovid1 = tx11.getText();
				String accordingToeid3 = tx22.getText();

				// update vid1 based on 2 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("participate", "  vid1", vid1ToUpdate, "vid1", accordingTovid1);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("participate", " vid1", vid1ToUpdate, "eid3", accordingToeid3);
				}

				// update eid3 based on 2 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("participate", "eid3", eid3ToUpdate, "vid1", accordingTovid1);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("participatelabs", " eid3", eid3ToUpdate, "eid3", accordingToeid3);
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});
		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updateresearchPublish() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("topic");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("rname");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("did12");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		TextField tx4 = new TextField();
		Label lb4 = new Label("rid");
		HBox b4 = new HBox();
		b4.getChildren().addAll(lb4, tx4);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2, b3, b4);

		TextField tx11 = new TextField();
		Label lb11 = new Label("topic");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("rname");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		TextField tx33 = new TextField();
		Label lb33 = new Label("did12");
		HBox b33 = new HBox();
		b33.getChildren().addAll(lb33, tx33);

		TextField tx44 = new TextField();
		Label lb44 = new Label("rid");
		HBox b44 = new HBox();
		b44.getChildren().addAll(lb44, tx44);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22, b33, b44);

		bt.setOnAction(e -> {
			try {

				String topicToUpdate = tx1.getText();
				String rnameToUpdate = tx2.getText();
				String did12ToUpdate = tx3.getText();
				String ridToUpdate = tx4.getText();

				String accordingTotopic = tx11.getText();
				String accordingTorname = tx22.getText();
				String accordingTodid12 = tx33.getText();
				String accordingTorid = tx44.getText();

				// update topic based on 4 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("researchPublish", "   topic", topicToUpdate, " topic", accordingTotopic);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("researchPublish", "  topic", topicToUpdate, " rname", accordingTorname);
				}
				if (!tx1.getText().isEmpty() && !tx33.getText().isEmpty()) {
					updateRecords("researchPublish", "   topic", topicToUpdate, "did12", accordingTodid12);
				}
				if (!tx1.getText().isEmpty() && !tx44.getText().isEmpty()) {
					updateRecords("researchPublish", "   topic", topicToUpdate, "rid", accordingTorid);
				}

				// update rname based on 4 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("participate", "rname", rnameToUpdate, "topic", accordingTotopic);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("participatelabs", " rname", rnameToUpdate, "rname", accordingTorname);
				}
				if (!tx2.getText().isEmpty() && !tx33.getText().isEmpty()) {
					updateRecords("participate", "rname", rnameToUpdate, "did12", accordingTodid12);
				}
				if (!tx2.getText().isEmpty() && !tx44.getText().isEmpty()) {
					updateRecords("participatelabs", " rname", rnameToUpdate, "rid", accordingTorid);
				}

				// update did12 based on 4 attribute
				if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("participate", "did12", did12ToUpdate, "topic", accordingTotopic);
				}
				if (!tx3.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("participatelabs", " eid3", did12ToUpdate, "rname", accordingTorname);
				}
				if (!tx3.getText().isEmpty() && !tx33.getText().isEmpty()) {
					updateRecords("participate", "eid3", did12ToUpdate, "eid12", accordingTodid12);
				}
				if (!tx3.getText().isEmpty() && !tx44.getText().isEmpty()) {
					updateRecords("participatelabs", " eid3", did12ToUpdate, "rid", accordingTorid);
				}

				// update rid based on 4 attribute
				if (!tx4.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("participate", "rid", ridToUpdate, "rid", accordingTorid);
				}
				if (!tx4.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("participatelabs", " rid", ridToUpdate, "did12", accordingTodid12);
				}
				if (!tx4.getText().isEmpty() && !tx33.getText().isEmpty()) {
					updateRecords("participate", "rid", ridToUpdate, "rname", accordingTorname);
				}
				if (!tx4.getText().isEmpty() && !tx44.getText().isEmpty()) {
					updateRecords("participatelabs", " rid", ridToUpdate, "topic", accordingTotopic);
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox Updateuse() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("lid");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid5");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2);

		TextField tx11 = new TextField();
		Label lb11 = new Label("lid");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("eid5");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22, bt);

		bt.setOnAction(e -> {
			try {

				String lidToUpdate = tx1.getText();
				String eid5ToUpdate = tx2.getText();

				String accordingTolid = tx11.getText();
				String accordingToeid5 = tx22.getText();

				// update lid based on 2 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("use", "    lid", lidToUpdate, "  lid", accordingTolid);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("use", " lid", lidToUpdate, " eid5", accordingToeid5);
				}

				// update eid5 based on 2 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("use", "  eid5", eid5ToUpdate, "lid", accordingTolid);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("use", "  eid5", eid5ToUpdate, "eid5", accordingToeid5);
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updateWorkIn() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("since");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("eid11");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		TextField tx3 = new TextField();
		Label lb3 = new Label("did11");
		HBox b3 = new HBox();
		b3.getChildren().addAll(lb3, tx3);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2, b3);

		TextField tx11 = new TextField();
		Label lb11 = new Label("since");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("eid11");
		HBox b22 = new HBox();
		b2.getChildren().addAll(lb22, tx22);

		TextField tx33 = new TextField();
		Label lb33 = new Label("did11");
		HBox b33 = new HBox();
		b33.getChildren().addAll(lb33, tx33);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22, b33);

		bt.setOnAction(e -> {
			try {

				String sinceToUpdate = tx1.getText();
				String eid11ToUpdate = tx2.getText();
				String did11ToUpdate = tx3.getText();

				String accordingTosince = tx11.getText();
				String accordingToeid11 = tx22.getText();
				String accordingTodid11 = tx33.getText();

                //update  since based on 3 attribute 
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("WorkIn", " since", sinceToUpdate, " since", accordingTosince);
				}

				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("WorkIn", "since", sinceToUpdate, " eid11", accordingToeid11);

				}

				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("WorkIn", "since", sinceToUpdate, " did11", accordingTodid11);
				}

				// update eid11 based on 3 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("WorkIn", "eid11", eid11ToUpdate, "since", accordingTosince);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("WorkIn", "eid11", eid11ToUpdate, "eid11", accordingToeid11);
				}

				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("WorkIn", "eid11", eid11ToUpdate, " did11", accordingTodid11);
				}

				// update did11 based on 3 attribute
				if (!tx3.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("WorkIn", " did11", did11ToUpdate, "since", accordingTosince);
				}
				if (!tx3.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("WorkIn", " did11", did11ToUpdate, "eid11", accordingToeid11);
				}

				if (!tx3.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("WorkIn", "did11", did11ToUpdate, "did11", accordingTodid11);
				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;
	}

	public VBox updatewrite() {
		Stage stage = new Stage();
		Label toUpdate = new Label("CHOOSE ATTRIBUTE TO UPDATE");
		Label where = new Label("ACCORDING TO WHAT VALUE?");
		Button bt = new Button("Done");

		TextField tx1 = new TextField();
		Label lb1 = new Label("eid12");
		HBox b1 = new HBox();
		b1.getChildren().addAll(lb1, tx1);

		TextField tx2 = new TextField();
		Label lb2 = new Label("rid1");
		HBox b2 = new HBox();
		b2.getChildren().addAll(lb2, tx2);

		VBox pane1 = new VBox();
		pane1.getChildren().addAll(toUpdate, b1, b2);

		TextField tx11 = new TextField();
		Label lb11 = new Label("eid12");
		HBox b11 = new HBox();
		b11.getChildren().addAll(lb11, tx11);

		TextField tx22 = new TextField();
		Label lb22 = new Label("rid1");
		HBox b22 = new HBox();
		b22.getChildren().addAll(lb22, tx22);

		VBox pane2 = new VBox();
		pane2.getChildren().addAll(where, b11, b22, bt);

		bt.setOnAction(e -> {
			try {

				String eid12ToUpdate = tx1.getText();
				String rid1ToUpdate = tx2.getText();

				String accordingToeid12 = tx11.getText();
				String accordingTorid1 = tx22.getText();

				// update eid12 based on 2 attribute
				if (!tx1.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("write", " eid12", eid12ToUpdate, " eid12", accordingToeid12);
				}
				if (!tx1.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("write", "eid12", eid12ToUpdate, " rid1", accordingTorid1);

				}

				// update rid1 based on 2 attribute
				if (!tx2.getText().isEmpty() && !tx11.getText().isEmpty()) {
					updateRecords("write", " rid1", rid1ToUpdate, " eid12", accordingToeid12);
				}
				if (!tx2.getText().isEmpty() && !tx22.getText().isEmpty()) {
					updateRecords("write", "rid1", rid1ToUpdate, " rid1", accordingTorid1);

				}
			} catch (NumberFormatException ex) {
				System.out.println("Invalid input. Please enter a valid number.");
			}
		});

		VBox pane = new VBox();
		pane.getChildren().addAll(pane1, pane2, bt);

		Scene scene = new Scene(pane);
		return pane;

	}

	private void updateRecords(String tableName, String fieldNameToSet, String valueToSet, String fieldNameWhere,
			String valueWhere) {
		String sql = "UPDATE " + tableName + " SET " + fieldNameToSet + " = ? WHERE " + fieldNameWhere + " = ?";

		try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, valueToSet);
			pstmt.setString(2, valueWhere);
			int affectedRows = pstmt.executeUpdate();
			System.out.println("Updated " + affectedRows + " records in " + tableName + " table.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}