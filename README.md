# flywaydemo

### ✅ 1. Start Your Spring Boot Application

* **Ensure your Spring Boot application is running** and Flyway has already applied your migrations (V1, V2, V3, etc.).

### ✅ 2. Open H2 Console

* **Navigate to the H2 console** by opening this URL in your browser:

  ```
  http://localhost:8080/h2-console
  ```
* You should see the **H2 login screen**.

### ✅ 3. Fill H2 Connection Details

* In the login form, enter the following details:

  * **JDBC URL**: `jdbc:h2:mem:testdb`
  * **User Name**: `sa`
  * **Password**: *(leave it blank)*

  After filling the details, click **Connect**.

### ✅ 4. Run the Flyway History Query

* Once connected, paste this SQL query into the H2 console:

  ```sql
  SELECT * FROM "flyway_schema_history";
  ```
* Click **Run** or press **Ctrl + Enter**.

### ✅ 5. View Results

* You’ll see the migration history displayed as a table, with columns like `installed_rank`, `version`, `description`, and `script`. For example:

  ```
  +----------------+---------+-----------------------+-----------------------------------+
  | installed_rank | version | description           | script                            |
  +----------------+---------+-----------------------+-----------------------------------+
  | 1              | 1       | create_employee_table | V1__create_employee_table.sql     |
  | 2              | 2       | insert_sample_data    | V2__insert_sample_data.sql        |
  | 3              | 3       | add_salary_column     | V3__add_salary_column.sql         |
  +----------------+---------+-----------------------+-----------------------------------+
  ```

### 🧠 Why This is Useful

* This query helps you **track all the migrations** applied to your database through Flyway. You’ll be able to see:

  * Table creation
  * Data insertion
  * Column addition
  * Future schema changes
* The **`flyway_schema_history` table** serves as Flyway's change log, keeping a record of all applied migrations.
