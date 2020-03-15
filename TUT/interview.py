import requests

def pokemon_extract(poke, lang):
    pokedata = []
    for pokemon in poke:
        r = requests.get('https://pokeapi.co/api/v2/pokemon/' + pokemon)
        extract = r.json()['abilities']
        for i in extract:
            data = requests.get(i['ability']['url'])
            for j in data.json()['names']:
                if j['language']['name'] == lang:
                    pokedata.append((j['name']))

    return list(set(pokedata))

print(pokemon_extract([ 'charmander', 'bulbasaur', 'squirtle', 'chikorita', 'cyndaquil', 'totodile' ], 'es'))
