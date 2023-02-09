import sqlite3

def find_details(id2find):

    db = sqlite3.connect("surfersDB.sdb")
    db.row_factory = sqlite3.Row
    cursor = db.cursor()
    cursor.execute("select * from surfers")
    rows = cursor.fetchall()
    for row in rows:
        if row['id'] == id2find:
            s = {}
            s['id'] = str(row['id'])
            s['name'] = str(row['name'])
            s['country'] = str(row['country'])
            s['average'] = str(row['average'])
            s['board'] = str(row['board'])
            s['age'] = str(row['age'])
            cursor.close()
            return(s)
    cursor.close()

    return({})

id2find = int(input("Digite o ID do surfista: "))
surfer = find_details(id2find)
if surfer:
    print("ID:      " + surfer['id'])
    print("Nome:    " + surfer['name'])
    print("País:    " + surfer['country'])
    print("Média:   " + surfer['average'])
    print("Prancha: " + surfer['board'])
    print("Idade:   " + surfer['age'])