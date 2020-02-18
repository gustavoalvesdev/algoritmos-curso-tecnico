# Elaborar um algoritmo que efetue a apresentação do valor de
# conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
# deverá solicitar o valor da cotação do dólar e também a quantidade de
# dólares disponíveis com o usuários

# Data: 17/02/2020
# Autor: Gustavo Alves da Silva

dolares = float(input('Quantidade de dinheiro em dólares: US$ '))
cotacao = float(input('Cotação do dólar: R$ '))
reais = dolares * cotacao
print('A quantidade de dinheiro em reais é de: R$ {:.2f}'.format(reais))