Melwig Victor (26/10/24)Mission 2 Filius

Étape 1
1) Quel est le CIDR de chaque machine ? Justifier.
M1 : 10.10.1.100 – Le CIDR est 10.10.1.0/24, car l'adresse semble être dans un sous-réseau de 256 adresses.
M2 : 10.0.1.255 – Le CIDR est 10.0.1.0/24, même logique de sous-réseau en /24.
M3 : 10.0.10.245 – CIDR probable 10.0.10.0/24.
M4 : 10.10.20.128 – CIDR probable 10.10.20.0/24.

2)À quel sous-réseau IP appartient chacune de ces machines ? Justifier.
M1 appartient au sous-réseau 10.10.1.0/24.
M2 appartient au sous-réseau 10.0.1.0/24.
M3 appartient au sous-réseau 10.0.10.0/24.
M4 appartient au sous-réseau 10.10.20.0/24.

3)Combien de machines maximum peuvent accueillir chacun des sous-réseaux identifiés ?
Un sous-réseau en /24 peut accueillir 254 hôtes (adresses utilisables allant de .1 à .254).

4)Quelles machines peuvent potentiellement communiquer entre elles ? Justifier.
M1 peut communiquer avec d'autres machines du sous-réseau 10.10.1.0/24, soit M5 si elle est dans le même réseau.
M2 peut communiquer avec des machines du sous-réseau 10.0.1.0/24, soit M6 si elle est dans le même réseau.
La communication entre M1, M2, M3 et M4 nécessite un routeur ou une passerelle car ils sont dans des sous-réseaux différents.

5)Peuvent-elles dans les conditions physiques présentées ci-dessus communiquer entre elles ? Justifier.
Non, elles ne peuvent pas communiquer sans un routeur, car elles sont dans des sous-réseaux différents et les switches seuls ne permettent pas la communication inter-sous-réseaux.

6)Quelle est la commande complète qui permet à M1 de tester la liaison avec M2 ?
La commande est ping 10.0.1.255, mais cette adresse étant une adresse de broadcast, il faudrait vérifier l'adresse IP exacte de M2 si on veut tester une machine spécifique.

Étape 2

1)Quelles sont les adresses IP possibles pour M5 et M6 ?
M5 peut avoir une adresse dans le sous-réseau 10.10.1.0/24 (par exemple 10.10.1.101).
M6 peut avoir une adresse dans le sous-réseau 10.0.1.0/24 (par exemple 10.0.1.254).

2)Combien de machines peut-on encore ajouter dans chaque sous-réseau ?
Dans un sous-réseau /24, il y a 254 adresses possibles, moins celles déjà assignées.

3)Si M6 veut envoyer un message à toutes les machines de son sous-réseau, quelle adresse IP peut-elle utiliser ?
Elle peut utiliser l’adresse de diffusion 10.0.1.255.

4)Quel média d'interconnexion est nécessaire pour permettre à toutes les machines d'échanger des messages ?
Un routeur est nécessaire pour permettre la communication entre les sous-réseaux.
