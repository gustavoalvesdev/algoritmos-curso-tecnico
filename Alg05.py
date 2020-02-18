# Escrever um algoritmo que leia o nome de um aluno e as notas
# das três provas que ele obteve no semestre. No final informar o nome do
# aluno e a sua média (aritmética).

# Data: 17/02/2020
# Autor: Gustavo Alves da Silva

nome = input('Insira o nome do aluno: ')

notas = []

for i in range(3):
   notas.append(float(input('Digite o valor da nota: '.format(i))))

soma_notas = 0.0

for i in range(3):
    soma_notas = soma_notas + notas[i]

media = soma_notas / 3

print('Aluno: {}'.format(nome))
print('Média: {:.1f}'.format(media))