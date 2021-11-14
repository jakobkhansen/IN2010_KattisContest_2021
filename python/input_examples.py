# Kattis forventer at man leser inn input via standard input. 
# Dette er det samme som å lese inn brukerinput, og det samme som dere gjorde på Teque i
# oblig 1

# Hvis man har en inputfil.txt, kan man kjøre programmet sitt med filen som input slik:
# python program.py < inputfil.txt

# sys.stdin inneholder mange funksjoner for å lese inn input
import sys

# Les inn en linje som er bare ett tall
x = int(input())

# Les inn en linje med mange tall til en liste med tall
nums = [int(x) for x in input().split()]

# Itererer over resten av input
for line in sys.stdin:
    print(line)

# Les inn en n*m matrise med tall fra input
# For eksempel hvis input ser slik ut:
# 1 0 1 0
# 1 0 1 0
# 1 0 1 0
# 1 0 1 0
n = 4 
matrix = [[int(x) for x in input().split()] for _ in range(n)]
