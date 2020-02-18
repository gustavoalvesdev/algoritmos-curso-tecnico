# Ler uma temperatura em graus Celsius e apresentá-la convertida
# em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160)/5, sendo F a
# temperatura em Fahrenheit e C a temperatura em Celsius.

# Data: 17/02/2020
# Autor: Gustavo Alves da Silva

c = float(input('Digite a temperatura em Celsius: '))
f = (9 * c + 160) / 5
print('Temperatura em Fahrenheit: {:.1f}'.format(f))
