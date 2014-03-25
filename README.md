Java2014
========

Programe la cursul "Tehnologii si platforme Java pentru aplicatii distribuite"

1. HelloGit - este celebra aplicatie "Hello World" scrisa in Java. Git este sistemul de control al versiunii 
pe care noi il folosim deocamdata doar pentru distribuirea proiectelor. 
Pe masura ce vom adauga noi proiecte in acest repository se va completa si acest README.

2. ContBancar - este o aplicatie in care este exemplificat principiul incapsularii. Datele si operatiile care
se efectueaza asupra acelor date sunt puse intr-o "capsula" care este clasa. De asemenea tot in acest proiect 
 sunt folosite cuvintele cheie public si private pentru a indica ce anume este accesibil din afara capsulei
si ce ramane inauntru, inaccesibil din afara (soldul contului). Pentru a modifica datele (soldul contului) se folosesc 
doua metode de interfata retrage/depune care implementeaza o anumita logica pentru aceste operatii. 
Tot aici este introdusa si notiunea de metoda constructor al carei rol este de initializa instantele unei clase (obiectele). 

3. FormeGeometrice - aplicatie in care sunt exemplificate celelalte doua principii fundamentale ale programarii orientate
pe obiecte (POO) - mostenire si polimorfims prin functii virtuale. Este creata o clasa FormaGeometrica. Aceasta este clasa
de baza (sau superclasa sau clasa generala) pentru alte doua clase derivate (sau subclase sau clase specializate)
Dreptunghi si Elipsa. Relatia dintre FormaGeometrica si Dreptunghi si intre FormaGeometrica si Elipsa este de tip
"este un fel de". Atunci cand intre doua clase apare aceasta sintagma "este un fel de" putem identifica relatia de mostenire. 
Cuvantul cheie in Java pentru realizarea relatiei de mostenire este "extends". Este prezentat si modul in care se poate
apela din constructorul clasei derivate constructorul clasei de baza. 
Polimorfismul prin functii virtuale este implicit in Java (nu e nevoie de nici un cuvant cheie). Atunci cand avem o 
referinta la clasa de baza care refera un obiect de tip derivat si ambele clase au cate o metoda cu aceeasi semnatura
(nume, lista de parametri si tip de return identice) apelarea metodei prin intermediul referintei la clasa de baza va
determina apleul metodei din clasa derivata. 
Pe scurt este introdus si conceptul de inerfata. Cuvantul cheie folosit la implementarea unei interfete de catre o  clasa
este "implements2". O clasa poate avea o singura clasa de baza dar poate implementa oricate interfete. 

