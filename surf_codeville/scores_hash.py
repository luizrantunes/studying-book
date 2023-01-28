scores = {}
result_f = open("results.txt")
for line in result_f:
    (name, score) = line.split()
    scores[score] = name
result_f.close()
print("The top scores were:")
for each_score in sorted(scores.keys(), reverse = True):
    print('O surfista ' + scores[each_score] + ' marcou ' + each_score + ' pontos.')