import MySQLdb

db = MySQLdb.connect("Localhost", "testuser", "dsgsfgsf", "Testdb" )

cursor = db.cursor()

# ~ cursor.exceute("Select version()")

# ~ data = cursor.fetchone()
# ~ print ("Database version: ", data)

cursor.execute("DROP TABLE IF EXISTS EMPLOYEE")

sql1 = """ CREATE TABLE EMPLOYEE (
          ID INT AUTOINCREMENT,
          FIRST_NAME  CHAR(20) NOT NULL,
          LAST_NAME VARCHAR(20),
          AGE INT,
          SEX CHAR(1),
          SALARY FLOAT,
          PRIMARY KEY (id))"""

cursor.excecute(sql1)

sql2 = """INSERT INTO EMPLOYEE(ID, FIRST_NAME, LAST_NAME, AGE, SEX, INCOME) VALUES ('JDFN', "DSNF")"""

try:
    cursor.execute(sql2)
    db.commit()
except:
    db.rollback()
db.close()
