def find_details(id2find):

    surfers_f = open("surfing_data.csv")
    
    for each_line in surfers_f:
        s = {}
        (s['id'],
        s['name'],
        s['country'],
        s['average'],
        s['board'],
        s['age']) = each_line.split(";")
    
        if id2find == int(s['id']):
            surfers_f.close()
            return(s)

    surfers_f.close

    return({})

lookup_id = int(input("Digite o ID do surfista: "))
surfer = find_details(lookup_id)

if surfer:
    print("ID:      " + surfer['id'])
    print("Nome:    " + surfer['name'])
    print("País:    " + surfer['country'])
    print("Média:   " + surfer['average'])
    print("Prancha: " + surfer['board'])
    print("Idade:   " + surfer['age'])