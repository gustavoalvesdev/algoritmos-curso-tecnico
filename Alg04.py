# Escrever um algoritmo que leia o nome de um vendedor, o seu
# salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
# Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
# efetuadas, informar o seu nome, o salário fixo e salário no final do mês.

# Data: 17/02/2020
# Autor: Gustavo Alves da Silva

nome = input('Nome do vendedor: ')
salario_fixo = float(input('Salário fixo: R$ '))
vendas = float(input('Vendas: R$ '))
salario_comissao = salario_fixo + vendas * 0.15
print('Nome do vendedor: {}'.format(nome))
print('Salário fixo: R$ {:.2f}'.format(salario_fixo))
print('Salário com comissão: R$ {:.2f}'.format(salario_comissao))
