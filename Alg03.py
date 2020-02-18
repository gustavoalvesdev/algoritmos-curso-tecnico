# Função : Escrever um algoritmo para determinar o consumo médio de um
# automóvel sendo fornecida a distância total percorrida pelo automóvel e
# o total decombustível gasto.

# Data: 17/02/2020
# Autor: Gustavo Alves da Silva

dist = float(input('Digite a distância total percorrida em quilômetros: '))
comb = float(input('Digite o total de combustível gasto: '))
media = dist / comb
print('Este veículo percorre {0:.1f} KM por litro de combustível'.format(media))