line = "101;Johnny 'wave-boy' Jones;USA;8.32;Fish;21"

s = {}

(s['id'], s['name'],s['country'],s['average'],s['board'],s['age']) = line.split(";")

print("ID: " + s['id'])
print("Nome: " + s['name'])
print("País: " + s['country'])
print("Média: " + s['average'])
print("Prancha: " + s['board'])
print("Idade: " + s['age'])