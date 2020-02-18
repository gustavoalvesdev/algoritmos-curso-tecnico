# A Loja Mamão com Açucar está vendendo seus produtos em 5
# (cinco) prestações sem juros. Faça um algoritmo que receba um valor de
# compra e mostre o valor das prestações.

# Data: 17/02/2020
# Autor: Gustavo Alves da Silva

compra = float(input('Digite o valor da compra: R$ '))
prest = compra / 5
print('Você pode pagar em 5 (cinco) prestações de R$ {:.2f}'.format(prest))