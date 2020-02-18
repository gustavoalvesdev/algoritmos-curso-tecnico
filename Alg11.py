# Faça um algoritmo que receba o preço de custo de um produto e
# mostre o valor de venda. Sabe-se que o preço de custo receberá um
# acréscimo de acordo com um percentual informado pelo usuário

# Data: 17/02/2020
# Autor: Gustavo Alves da Silva

preco_custo = float(input('Digite o preço de custo do produto: R$ '))
percentual = float(input('Digite o percentual de acréscimo: '))
calculo = (preco_custo * percentual) / 100
valor_venda = calculo + preco_custo
print('O produto será vendido por: R$ {:.2f}'.format(valor_venda))