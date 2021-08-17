a = {'alice': [1, 2, 3], 'bob': 20, 'tony': 15, 'suzy': 30}
b = dict(a)
a

print(id(a))
print(id(b))

b['alice'].append(5)

print(a)
print(b)

print(b.get('bob'))
b['bob'] += 20
print(b.get('bob'))