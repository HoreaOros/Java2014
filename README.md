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

4. DataCalendaristica - sunt exemplificate mai multe aspecte de programare in Java: supraincarcarea metodei constructor (crearea mai multor constructori intr-o clasa pentru a putea initializa o instanta in mai multe moduri), crearea unui constructor de copiere, suprascrierea unor metode din clasa Object (toString, equals), implementarea interfetei generice IComparable<T>, 

5. Bars - aplicatie care ilustreaza una din principalele relatii intre clase - relatia de continere. Sunt create doua clase BaraOrizontala si BaraVerticala care la instantiere "deseneaza" o linie orizontala respectiv verticala. Desenarea se face in metoda constructor. Pe baza acestor doua clase se creaza clasa Frame ce contine o bara verticala si doua bare orizontale. Dupa aceea se creeaza clasa Ladder  care contine doua Frame si o bara verticala. Aplicatia demonstreaza modul in care pe baza unor obiecte simple se pot realiza obiecte mai complicate prin reutilizarea codului - actiune care este specifica programarii orientate pe obiecte. 

6. Math - este exemplificat conceptul de functie cu numar variabil de argumente. Este creata o clasa "Cerc" pentru care sunt definite cateva metode: Aria, Perimetrul. Un cerc este definit prin doua puncte x,y si prin raza. Se foloseste constanta "PI" din clasa java.lang.Math.  Este suprascrisa metoda toString pentru clasa Cerc prin care se obtine o reprezentare textuala a unui cerc de forma [(x, y) - raza]. S-au discutat si alte metode ale clasei java.lang.Math. 

7. Time - este creata o clasa MyTime care are trei membri ora/minut/secunda. Sunt creati mai multi constructori ce permit initalizarea unui obiect in mai multe moduri. Este exemplificat modul in care un constructor poate apela explicit altul prin intermediul cuvantului cheie this. Este folosit si un constructor care primeste ca argument un String de forma "hh:mm:ss" si care extrage cele trei componente numerice din acest string. Sunt create doua metode AddHours() si AddMinutes() care creeaza noi obiecte de tip MyTime cu ora/minutul modificate. Tema de casa este implementarea operatiilor de comparare.


