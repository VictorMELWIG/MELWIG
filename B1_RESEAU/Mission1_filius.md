Melwig Victor(13/10/2024) Mission1
Etape 1 :
1. Quel est le masque de sous-réseau de chaque machine ? 
255.255.0.0
2. A quel sous-réseau IP appartient chaque machine ? Justifier 
M1 M2 et M3 appartiennent tous au même sous-réseau 192.168.0.0/16 avec un masque de sous-réseau de 255.255.0.0 (notation CIDR : /16)
3. Peuvent-elles potentiellement communiquer entre elles ? Justifier.
Oui les machines peuvent potentiellement communiquer entre elles car elles appartiennent au même sous-réseau 192.168.0.0/16.
4. Peuvent-elles dans les conditions physiques présentées ci-dessus communiquer entre elles ? Justifier.
si elles sont connectées à un réseau commun (par un switch ou un routeur) vu qu’elles appartiennent au même sous-réseau elles pourront alors communiquer sans problème
5. Quelle commande sur le terminal Filius permet de voir la configuration IP d’une STA ?
ipconfig
6. Quelle commande permet de tester que les messages IP sont bien transmis entre deux machines ?
ping + l'adresse IP d'une autre machine

Etape 2 :
1. Quel média de communication a été ajouté ? Expliquer brièvement son fonctionnement.
J'ai ajouté un switch, le switch facilite une communication plus efficace dans un réseau local en dirigeant les paquets de données directement entre les appareils, 
en fonction de leurs adresses MAC, sans inonder tous les autres appareils avec des trames inutiles.
2. Nous aurions pu rajouter un concentrateur a la place du switch.
3. Est-ce que toutes les machines peuvent maintenant communiquer entre elles ? Justificateur.
 Oui 
4. Si nécessaire, corriger les configurations pour permettre à toutes les STAs de communiquer entre elles. Quelles sont les modifications apportées ?
(M1)192.168.10.10/16 (M2)192.168.0.10/16 (M3)192.168.0.20/16 
5. Si M1 veut envoyer un message à toutes les machines de son sous-réseau, quelle adresse logique peut-elle utiliser ? 
ping 192.168.255.255/16

Eatpe 3 : 
1. A quel réseau logique appartient la 4e machine (M4) ? Est-ce le même que celui des Machines M1, M2 et M3 ? Justificateur
M4 (192.169.0.10/16)publique nan car M4 est a 169 et les autres 168
2. M4 peut-elle communiquer avec M1, M2 ou M3 ? Justificateur. 
 Oui car tous les appareils partagent le même masque de sous-réseau (/16) ce qui leur permet de voir les autres comme des adresses accessibles sur le même réseau local
les adresses IP sont compatibles : Les adresses de M4 (192.168.0.30/16) se trouvent dans la même plage d'adresses que celles de M1, M2 et M3
3. Si nécessaire, reconfigurer M2 pour lui permettre d’échanger des messages avec M4. Quels sont les changements nécessaires ?
Pas besoin puisqu'ils peuvent deja communiquer entre eux.
4. Est-ce que M1 et M2 peuvent toujours communiquer ? Justificateur.
Oui