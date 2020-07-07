import pandas as pd
import pymysql

conn = pymysql.connect(
    host="localhost",
    user="root",
    password="zjw959",
    database="tree",
    charset='utf8')
cursor = conn.cursor()

df = pd.read_csv('src/main/resources/static/batchFile/input.csv')
for row in df.values:
    pwd = '5ad810773432ef92a6ce9164e94c5729'
    sql = f'''
INSERT INTO `user` (`nick_name`,`phone`,`password`,`email`,`token`,`avatar_url`,`gmt_create`,`gmt_motified`,`sex`,`sign`,`grade`,`follow_count`,`fans_count`,`address`,`score`,`type`) 
VALUES ({row[0]},{row[1]},'{pwd}',NULL,'2dac7dfe-cbe4-4c8d-8575-30a2eec38cfc','/images/default-avatar.png',NULL,NULL,0,NULL,1,0,0,'保密',0,1);
'''
    print(sql)
    cursor.execute(sql)
    conn.commit()

# cursor.close()
conn.close()