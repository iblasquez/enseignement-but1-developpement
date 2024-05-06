#  Réaliser un developpement d'application  
BUT1 : Développement Orienté Objet (R2.01) & Qualité (R2.03)
---
Support d'enseignement : bases de la conception orientée objet, bases de la programmation orientée objet avec Java, introduction à la notion de tests,...


Dans ce dépôt, vous trouverez les rubriques suivantes :

- [Supports de cours & vidéos](#cours)
- [Enoncés TD](#td)  
- [Enoncés TP](#tp)
- [Aides mémoires (Cheat sheet)](#cheatsheet)  
- [Ressources complémentaires](#ressources)  


## Supports de cours & vidéos <a id="cours"></a>


### R2.01 : Support de cours relatifs à la Conception Orientée Objet

- [Introduction à la Modélisation par Objets : UML à la rescousse !](./cours/1_IntroductionModelisationObjet_UML.pdf)  
- [Introduction à la Modélisation par Objets : A la découverte des objets et des classes](./cours/2_IntroductionModelisationObjet_DecouverteClassesObjet.pdf)  
- [Diagrammes de classes](./cours/3_DiagrammesDeClasses.pdf)  
- [Diagrammes de séquence et un zeste de diagrammes de cas d'utilisation (UC)](./cours/7_DiagrammesDeSequence_DiagrammeUC.pdf)


### R2.03 : Support de cours relatifs à la qualité logicielle

- [Introduction à git : un logiciel de gestion de versions décentralisé (DVCS)](./cours/5_GestionnaireDeVersion_Git.pdf)  
- [Sensibilisation aux bonnes pratiques de programmation](./cours/4_QualiteLogicielle_CleanCode.pdf)
- [Quid du Test dans un développement logiciel ?](./cours/6_Tests.pdf)


### R2.01 : Vidéos utilisées pour la Programmation Orientée Objet Java (pédagogie semi-inversée)

**Les vidéos utilisées pour (re)découvrir la POO Java (en français) sont celles de la chaine youtube [Cours-en-ligne](https://www.youtube.com/channel/UCIatmtIm9z5YEWuHbrUMLsw) de [José Paumard](https://twitter.com/JosePaumard)**  

Pour les enseignements de BUT1, focalisez-vous uniquement sur les playlists suivantes :  
[**Ecrire une première classe en Java**](https://www.youtube.com/playlist?list=PLzzeuFUy_CniXWmmdo8zmqo3bXdgy4aG8),  
[**Structure d'une classe**](https://www.youtube.com/playlist?list=PLzzeuFUy_Cnh_jAwFXkYMjRd9wYhObqAL),  
[**Classes Object et String**](https://www.youtube.com/playlist?list=PLzzeuFUy_CnhW4RoeaQ36pZ5tgoK5lxr7),   
[**Constructeur d’objet**](https://www.youtube.com/playlist?list=PLzzeuFUy_Cni3_xF9bl5oNDvrc757-4ih),  
[**Programmation Objet : Encapsulation, Héritage et Polymorphisme en Programmation Objet**](https://www.youtube.com/playlist?list=PLzzeuFUy_CnjZpKCGfQ9HpJFxkqGeGFO0),  
[**Classes, classes abstraites et interfaces**](https://www.youtube.com/playlist?list=PLzzeuFUy_CniTo0Pm8Tdh7MVVYhF32fdx),  
[**Java Beans, énumérations et records**](https://www.youtube.com/playlist?list=PLzzeuFUy_Cnhqiu6--3bHYzJxKl7P3Cu1),  
[**Type et compatibilité entre types**](https://www.youtube.com/playlist?list=PLzzeuFUy_Cnirn5sXqo2zsDReWymBRdK3),  
[**API Collection**](https://www.youtube.com/playlist?list=PLzzeuFUy_CngUL4wcmpV4pmMJZnxUZt-_) 

## Enoncés de TD <a id="td"></a>

- TD n° 1 : [Introduction au diagramme de classes & premiers pas en java](./TD/Dev_TD_IntroDiagrammeClasses.pdf)
- TD n° 2 : [Les débuts de l'informatique moderne : la classe ! (Conception & Implémentation d'un diagramme de classes simple)](./TD/Dev_TD_DiagrammeClasses_Robot.pdf)  
- TD n° 3 : [En route vers l'héritage](./TD/Dev_TD_IntroHeritage.pdf)
- TD n° 4 : [Héritage et polymorphisme aux pays des abeilles](./TD/Dev_TD_Heritage_Abeilles.pdf)

- ...  enseignement en cours, la suite à venir ....

## Enoncés de TP <a id="tp"></a>




- **Pré-requis** : **Installation d'un JDK dans votre environnement de développement**
	- **Avez-vous une version du JDK d'installer sur votre machine ?**  
Pour en savoir plus, regardez la vidéo suivante [Installer un poste de développement Java](https://www.youtube.com/watch?v=Kd8UC18rw6M)   
Attention depuis juillet 2021, **adoptopenjdk.net** a migré vers [adoptium.net](https://adoptium.net).  
Vous pouvez également récupérer des versions du jdk sur [jdk.java.net](https://jdk.java.net) (choisir Ready for use). 

	- Que se passe-t-il si vous exécutez la commande "**java - version**" dans une invite de commande ?  
La version du jdk qui a été paramétré dans votre variable d'environnement JAVA_HOME doit s'afficher. Si ce n'est pas le cas, rendez-vous [ici](https://github.com/iblasquez/Back2Basics_Developpement) et plus particulièrement le lien [wikiHow to Set Java Home](https://www.wikihow.com/Set-Java-Home).



- TP n° 1 : [Premiers pas en Java à l'aide de l'IDE Eclipse](./TP/Dev_TP_PremierPas_Java_Eclipse.pdf)  
- TP n° 2 : [Un robot fortement typé](./TP/Dev_TP_Robot_Type.pdf)    
- TP n° 3 : [Personnaliser son environnement de développement (Plant UML) - Jouer avec les pionniers de l'informatique moderne (equals & hashCode) et faire un petit tour dans le Far-West (héritage)](./TP/Dev_TP_RetroConception_Computer_FarWest.pdf)


- ...  enseignement en cours, la suite à venir ....

- [Dernière bataille : Retour vers le projet warcardgame et premiers pas avec AssertJ](./TP/Dev_TP_DerniereBataille.pdf)

- **Pour les plus rapides (facultatif) :**
	- Complément du TP sur les abeilles : [Simulation de la vie d’une ruche](./TP/Dev_Complement_Abeilles_Ruche.pdf)
	- [Découverte et prise en main de l’API fluent AssertJ](./TP/Dev_PriseEnMain_AssertJ.pdf)


## Aides mémoires (Cheat sheet)<a id="cheatsheet"></a>

* **Cheat sheet sur la syntaxe UML** : [cheatsheet.pdf](./ressources/cheatsheet_UML_Lou_Franco.pdf)
*  **Brève introduction à git et Github** : [Github Starter Course](https://github.com/education/github-starter-course)
*  [**Git Command Explorer**](https://gitexplorer.com)
*  [**GitKraken Client Cheat Sheeet**](https://www.gitkraken.com/pdfs/gitkraken-git-gui-cheat-sheet)


## Ressources complémentaires <a id="ressources"></a>


* **_UML@Classroom_** de Martina Seidl, Marion Scholz, Christian Huemer & Gerti Kappel  
notamment la [rubrique Material(diapos additionelles)](http://www.uml.ac.at/en/lernen) du site web ressources [uml.ac.at](http://www.uml.ac.at)


- **Prise en main d'outils pour la génération de diagrammes UML** :  
Vous trouverez dans le dépôt [https://github.com/iblasquez/tuto_ModelisationUML](https://github.com/iblasquez/tuto_ModelisationUML), un ensemble de tutoriels et de liens autour d'outils permettant la génération de diagrammes UML.


- **S'entraîner de manière ludique à modéliser à l'aide d'UML...**  
[**UML PICTIONARY® : une phrase en un diagramme UML**](http://people.irisa.fr/Francois.Schwarzentruber/mit2_cvfp_2012/uml_pictionary_cards.zip)   (jeu créé par l'équipe de JM. Jezequel à l'IRISA Rennes)





## On en discute ?
Pour les discussions, c'est par [là](https://github.com/iblasquez/enseignement-but1-developpement/issues)  
Pour les propositions de contenu, de modification par [ici](https://github.com/iblasquez/enseignement-but1-developpement/pulls)  
Et bien sûr, n'hésitez pas à personnaliser vos messages avec des [emojis](http://www.webpagefx.com/tools/emoji-cheat-sheet/) :smile:

Licence
-------

Tous ces supports sont placés sous licence CC BY-NC-SA :  [Creative Commons
Attribution - Pas d'Utilisation Commerciale - Partage dans les Mêmes Conditions](https://creativecommons.org/licenses/by-nc-sa/4.0/)

<img src="https://licensebuttons.net/l/by-nc-sa/3.0/88x31.png" width="100">

En savoir plus sur [les licences Creative Commons](https://creativecommons.org/licenses/?lang=fr-FR) ...

Toutefois, toute personne enseignant au département Informatique de l'IUT du Limousin souhaitant utiliser ces documents doit demander une autorisation préalable :smile:

