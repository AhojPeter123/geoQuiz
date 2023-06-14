package com.example.geoquiz

import android.graphics.Color
import android.util.Log

object Map {

    val countryList = HashMap<String, Country>();

    fun createMap() {
        val albania = Country("Albania", "Tirana", -65510)
        val austria = Country("Austria", "Vienna", -2227969)
        val belarus = Country("Belarus", "Minsk", -16718337)
        val belgium = Country("Belgium", "Brussels", -16767233)
        val bosnia = Country("Bosnia and Herzegovina", "Sarajevo",-22272)
        val bulgaria = Country("Bulgaria", "Sofia", -65409)
        val croatia = Country("Croatia", "Zagreb",-15616)
        val cyprus = Country("Cyprus", "Nicosia", -65462)
        val czech = Country("Czech Republic", "Prague", -4849409)
        val denmark = Country("Denmark", "Copenhagen", -16744449)
        val estonia = Country("Estonia", "Tallinn",-16711703)
        val finland = Country("Finland", "Helsinki", -16711739)
        val france = Country("France", "Paris", -9371393)
        val germany = Country("Germany", "Berlin", -16740353)
        val greece = Country("Greece", "Athens", -65440)
        val hungary = Country("Hungary", "Budapest", -65332)
        val iceland = Country("Iceland", "Reykjavik", -8847616)
        val ireland = Country("Ireland", "Dublin",-16711930)
        val italy = Country("Italy", "Rome",-3840)
        val kosovo = Country("Kosovo", "Pristina", -1478371)
        val latvia = Country("Latvia", "Riga", -8984083)
        val lithuania = Country("Lithuania", "Vilnius", -16713473)
        val montenegro = Country("Montenegro", "Podgorica", -28160)
        val moldova = Country("Moldova", "Chisinau", -16730369)
        val netherlands = Country("Netherlands", "Amsterdam", -16754177)
        val northMacedonia = Country("North Macedonia", "Skopje", -48128)
        val norway = Country("Norway", "Oslo", -16711785)
        val poland = Country("Poland", "Warsaw", -16735489)
        val portugal = Country("Portugal", "Lisbon", -1769728)
        val romania = Country("Romania", "Bucharest", -65377)
        val russia = Country("Russia", "Moscow", -16711722)
        val serbia = Country("Serbia", "Belgrade", -34304)
        val slovakia = Country("Slovakia", "Bratislava", -65293)
        val slovenia = Country("Slovenia", "Ljubljana", -7936)
        val spain = Country("Spain", "Madrid", -6095104)
        val sweden = Country("Sweden", "Stockholm", -16711762)
        val switzerland = Country("Switzerland", "Bern", -6422273)
        val ukraine = Country("Ukraine", "Kyiv", -16723457)
        val unitedKingdom = Country("United Kingdom", "London", -16711811)

//Albania
        albania.addNeighbor(montenegro)
        albania.addNeighbor(serbia)
        albania.addNeighbor(northMacedonia)
        albania.addNeighbor(greece)

//Austria
        austria.addNeighbor(czech)
        austria.addNeighbor(germany)
        austria.addNeighbor(hungary)
        austria.addNeighbor(italy)
        austria.addNeighbor(slovakia)
        austria.addNeighbor(slovenia)

//Belarus
        belarus.addNeighbor(latvia)
        belarus.addNeighbor(lithuania)
        belarus.addNeighbor(poland)
        belarus.addNeighbor(russia)

//Belgium
        belgium.addNeighbor(france)
        belgium.addNeighbor(germany)

//Bosnia
        bosnia.addNeighbor(croatia)
        bosnia.addNeighbor(montenegro)
        bosnia.addNeighbor(serbia)

//Bulgaria
        bulgaria.addNeighbor(greece)
        bulgaria.addNeighbor(northMacedonia)
        bulgaria.addNeighbor(romania)
        //bulgaria.addNeighbor(turkey)

//Croatia
        croatia.addNeighbor(bosnia)
        croatia.addNeighbor(hungary)
        croatia.addNeighbor(montenegro)
        croatia.addNeighbor(slovenia)
//Czech republic
        czech.addNeighbor(austria)
        czech.addNeighbor(germany)
        czech.addNeighbor(poland)
        czech.addNeighbor(slovakia)

//Denmark
        denmark.addNeighbor(germany)
        denmark.addNeighbor(sweden)

//Estonia
        estonia.addNeighbor(latvia)
        estonia.addNeighbor(russia)

//Finland
        finland.addNeighbor(russia)
        finland.addNeighbor(sweden)

//France
        france.addNeighbor(belgium)
        france.addNeighbor(germany)
        france.addNeighbor(italy)
        france.addNeighbor(spain)

//Germany
        germany.addNeighbor(austria)
        germany.addNeighbor(belgium)
        germany.addNeighbor(czech)
        germany.addNeighbor(denmark)
        germany.addNeighbor(france)
        germany.addNeighbor(netherlands)
        germany.addNeighbor(poland)
        germany.addNeighbor(switzerland)

//Greece
        greece.addNeighbor(albania)
        greece.addNeighbor(bulgaria)
        greece.addNeighbor(northMacedonia)
        //greece.addNeighbor(turkey)

//Hungary
        hungary.addNeighbor(austria)
        hungary.addNeighbor(croatia)
        hungary.addNeighbor(romania)
        hungary.addNeighbor(serbia)
        hungary.addNeighbor(slovakia)

//Iceland
        //iceland.addNeighbor(none)
        //ireland.addNeighbor(none)

//Italy
        italy.addNeighbor(austria)
        italy.addNeighbor(france)
        italy.addNeighbor(slovenia)
        italy.addNeighbor(switzerland)


//Kosovo
        kosovo.addNeighbor(albania)
        kosovo.addNeighbor(montenegro)
        kosovo.addNeighbor(northMacedonia)
        kosovo.addNeighbor(serbia)

//Latvia
        latvia.addNeighbor(belarus)
        latvia.addNeighbor(estonia)
        latvia.addNeighbor(lithuania)


//Lithuania
        lithuania.addNeighbor(belarus)
        lithuania.addNeighbor(latvia)
        lithuania.addNeighbor(poland)
//Moldova
        moldova.addNeighbor(romania)
        moldova.addNeighbor(ukraine)
//Montenegro
        montenegro.addNeighbor(albania)
        montenegro.addNeighbor(bosnia)
        montenegro.addNeighbor(croatia)
        montenegro.addNeighbor(kosovo)
        montenegro.addNeighbor(serbia)

//North Macedonia
        northMacedonia.addNeighbor(albania)
        northMacedonia.addNeighbor(bulgaria)

// Norway
        norway.addNeighbor(sweden)
        norway.addNeighbor(finland)

// Poland
        poland.addNeighbor(germany)
        poland.addNeighbor(czech)
        poland.addNeighbor(slovakia)
        poland.addNeighbor(ukraine)
        poland.addNeighbor(belarus)
        poland.addNeighbor(lithuania)

// Portugal
        portugal.addNeighbor(spain)

// Romania
        romania.addNeighbor(hungary)
        romania.addNeighbor(ukraine)
        romania.addNeighbor(bulgaria)
        romania.addNeighbor(serbia)

// Russia
        russia.addNeighbor(norway)
        russia.addNeighbor(finland)
        russia.addNeighbor(estonia)
        russia.addNeighbor(latvia)
        russia.addNeighbor(lithuania)
        russia.addNeighbor(poland)
        russia.addNeighbor(belarus)
        russia.addNeighbor(ukraine)
        //russia.addNeighbor(georgia)
        //russia.addNeighbor(azerbaijan)
        //russia.addNeighbor(kazakhstan)
        //russia.addNeighbor(mongolia)
        //russia.addNeighbor(china)


// Serbia
        serbia.addNeighbor(hungary)
        serbia.addNeighbor(romania)
        serbia.addNeighbor(bulgaria)
        serbia.addNeighbor(northMacedonia)
        serbia.addNeighbor(kosovo)
        serbia.addNeighbor(montenegro)
        serbia.addNeighbor(bosnia)

// Slovakia
        slovakia.addNeighbor(czech)
        slovakia.addNeighbor(poland)
        slovakia.addNeighbor(ukraine)
        slovakia.addNeighbor(hungary)
        slovakia.addNeighbor(austria)

// Slovenia
        slovenia.addNeighbor(austria)
        slovenia.addNeighbor(italy)
        slovenia.addNeighbor(hungary)
        slovenia.addNeighbor(croatia)

// Spain
        spain.addNeighbor(portugal)
        spain.addNeighbor(france)


// Sweden
        sweden.addNeighbor(norway)
        sweden.addNeighbor(finland)

// Switzerland
        switzerland.addNeighbor(germany)
        switzerland.addNeighbor(austria)
        switzerland.addNeighbor(italy)
        switzerland.addNeighbor(france)

// Ukraine
        ukraine.addNeighbor(poland)
        ukraine.addNeighbor(slovakia)
        ukraine.addNeighbor(hungary)
        ukraine.addNeighbor(romania)
        ukraine.addNeighbor(belarus)
        ukraine.addNeighbor(russia)

// United Kingdom
        unitedKingdom.addNeighbor(ireland)



//add to HashMap
        countryList["Albania"] = albania
        countryList["Austria"] = austria
        countryList["Belarus"] = belarus
        countryList["Belgium"] = belgium
        countryList["Bosnia"] = bosnia
        countryList["Bulgaria"] = bulgaria
        countryList["Croatia"] = croatia
        countryList["Cyprus"] = cyprus
        countryList["Czech Republic"] = czech
        countryList["Denmark"] = denmark
        countryList["Estonia"] = estonia
        countryList["Finland"] = finland
        countryList["France"] = france
        countryList["Germany"] = germany
        countryList["Greece"] = greece
        countryList["Hungary"] = hungary
        countryList["Iceland"] = iceland
        countryList["Ireland"] = ireland
        countryList["Italy"] = italy
        countryList["Kosovo"] = kosovo
        countryList["Latvia"] = latvia
        countryList["Lithuania"] = lithuania
        countryList["Moldova"] = moldova
        countryList["Montenegro"] = montenegro
        countryList["Netherlands"] = netherlands
        countryList["North Macedonia"] = northMacedonia
        countryList["Norway"] = norway
        countryList["Poland"] = poland
        countryList["Portugal"] = portugal
        countryList["Romania"] = romania
        countryList["Russia"] = russia
        countryList["Serbia"] = serbia
        countryList["Slovakia"] = slovakia
        countryList["Slovenia"] = slovenia
        countryList["Spain"] = spain
        countryList["Sweden"] = sweden
        countryList["Switzerland"] = switzerland
        countryList["Ukraine"] = ukraine
        countryList["United Kingdom"] = unitedKingdom

        addQuestions()
    }

    private fun addQuestions()
    {
        countryList["Albania"]?.addQuestion(Question("What is the capital city of Albania?", arrayListOf("Tirana", "Saranda", "Vlorë", "Berat"),"Tirana"))
        countryList["Albania"]?.addQuestion(Question("What is the meaning of the double-headed eagle in the Albanian flag?", arrayListOf("Strength and unity", "Freedom and democracy", "Peace and prosperity", "Love and friendship"),"Strength and unity"))
        countryList["Albania"]?.addQuestion(Question("What is the name of the Albanian currency?", arrayListOf("Lek", "Euro", "Dollar", "Pound"),"Lek"))
        countryList["Albania"]?.addQuestion(Question("Which sea is Albania located on?", arrayListOf("Adriatic Sea", "Mediterranean Sea", "Black Sea", "Baltic Sea"),"Adriatic Sea"))
        countryList["Albania"]?.addQuestion(Question("What is the national dish of Albania?", arrayListOf("Tavë kosi", "Byrek", "Qofte", "Fërgesë"),"Tavë kosi"))

        countryList["Austria"]?.addQuestion(Question("What is the capital city of Austria?", arrayListOf("Vienna", "Salzburg", "Graz", "Innsbruck"), "Vienna"))
        countryList["Austria"]?.addQuestion(Question("What famous dessert originated in Austria?", arrayListOf("Sacher Torte", "Apple Strudel", "Linzer Torte", "Kaiserschmarrn"), "Sacher Torte"))
        countryList["Austria"]?.addQuestion(Question("What is the name of the river that runs through Vienna?", arrayListOf("Danube", "Rhine", "Elbe", "Main"), "Danube"))
        countryList["Austria"]?.addQuestion(Question("What is the name of the famous palace in Vienna that was once home to the Habsburg dynasty?", arrayListOf("Schönbrunn Palace", "Belvedere Palace", "Hofburg Palace", "Imperial Palace"), "Hofburg Palace"))
        countryList["Austria"]?.addQuestion(Question("What is the name of the Austrian ski resort that hosts the annual Hahnenkamm race?", arrayListOf("Kitzbühel", "St. Anton", "Kitzbüheler Horn", "Zell am See"), "Kitzbühel"))
        countryList["Austria"]?.addQuestion(Question("Which Austrian composer was known for his classical music compositions?", arrayListOf("Wolfgang Amadeus Mozart", "Franz Schubert", "Johann Strauss II", "Anton Bruckner"), "Wolfgang Amadeus Mozart"))

        countryList["Belarus"]?.addQuestion(Question("What is the capital city of Belarus?", arrayListOf("Minsk", "Grodno", "Brest", "Vitebsk"),"Minsk"))
        countryList["Belarus"]?.addQuestion(Question("What is the official language of Belarus?", arrayListOf("Belarusian", "Russian", "Polish", "Lithuanian"),"Belarusian"))
        countryList["Belarus"]?.addQuestion(Question("What is the name of the famous castle located in Mir, Belarus?", arrayListOf("Mir Castle", "Brest Fortress", "Nesvizh Castle", "Hrodna Castle"),"Mir Castle"))
        countryList["Belarus"]?.addQuestion(Question("Which country borders Belarus to the east?", arrayListOf("Russia", "Poland", "Ukraine", "Lithuania"),"Russia"))
        countryList["Belarus"]?.addQuestion(Question("What is the name of the national park in Belarus known for its primeval forests?", arrayListOf("Belovezhskaya Pushcha National Park", "Pripyatski National Park", "Braslav Lakes National Park", "Narochansky National Park"),"Belovezhskaya Pushcha National Park"))

        countryList["Belgium"]?.addQuestion(Question("What is the capital city of Belgium?", arrayListOf("Brussels", "Antwerp", "Ghent", "Bruges"),"Brussels"))
        countryList["Belgium"]?.addQuestion(Question("What is the most popular sport in Belgium?", arrayListOf("Football", "Cycling", "Tennis", "Hockey"),"Cycling"))
        countryList["Belgium"]?.addQuestion(Question("What is the name of the famous Belgian comic book series about a young journalist and his dog?", arrayListOf("Tintin", "Asterix", "Lucky Luke", "Spirou"),"Tintin"))
        countryList["Belgium"]?.addQuestion(Question("What is the name of the famous Belgian chocolate brand?", arrayListOf("Godiva", "Lindt", "Ferrero Rocher", "Cadbury"),"Godiva"))
        countryList["Belgium"]?.addQuestion(Question("What is the name of the famous Belgian musician known for his harmonica playing?", arrayListOf("Toots Thielemans", "Jacques Brel", "Stromae", "Maurane"),"Toots Thielemans"))

        countryList["Bosnia"]?.addQuestion(Question("What is the capital city of Bosnia and Herzegovina?", arrayListOf("Sarajevo", "Banja Luka", "Mostar", "Tuzla"), "Sarajevo"))
        countryList["Bosnia"]?.addQuestion(Question("What is the name of the famous bridge in Mostar?", arrayListOf("Stari Most", "Novi Most", "Sarajevski Most", "Baščaršijski Most"), "Stari Most"))
        countryList["Bosnia"]?.addQuestion(Question("Which river flows through the city of Banja Luka?", arrayListOf("Vrbas", "Neretva", "Drina", "Una"), "Vrbas"))
        countryList["Bosnia"]?.addQuestion(Question("What is the traditional Bosnian dish made of meat and onions, served with flatbread?", arrayListOf("Ćevapi", "Burek", "Pita", "Sarma"), "Ćevapi"))
        countryList["Bosnia"]?.addQuestion(Question("What is the name of the Olympic mountain near Sarajevo?", arrayListOf("Jahorina", "Bjelašnica", "Igman", "Trebević"), "Jahorina"))

        countryList["Bulgaria"]?.addQuestion(Question("What is the capital city of Bulgaria?", arrayListOf("Sofia", "Plovdiv", "Varna", "Burgas"), "Sofia"))
        countryList["Bulgaria"]?.addQuestion(Question("Which mountain range runs through Bulgaria?", arrayListOf("Balkan Mountains", "Carpathian Mountains", "Pyrenees", "Alps"), "Balkan Mountains"))
        countryList["Bulgaria"]?.addQuestion(Question("What is the name of the famous Bulgarian yogurt?", arrayListOf("Kiselo Mlyako", "Sirene", "Tarator", "Moussaka"), "Kiselo Mlyako"))
        countryList["Bulgaria"]?.addQuestion(Question("What is the currency of Bulgaria?", arrayListOf("Bulgarian Lev", "Euro", "US Dollar", "British Pound"), "Bulgarian Lev"))
        countryList["Bulgaria"]?.addQuestion(Question("Which sea is Bulgaria located on?", arrayListOf("Black Sea", "Mediterranean Sea", "Adriatic Sea", "Baltic Sea"), "Black Sea"))

        countryList["Croatia"]?.addQuestion(Question("What is the capital city of Croatia?", arrayListOf("Zagreb", "Dubrovnik", "Split", "Rijeka"), "Zagreb"))
        countryList["Croatia"]?.addQuestion(Question("What is the famous ancient Roman monument in Pula, Croatia?", arrayListOf("The Arena", "The Colosseum", "The Pantheon", "The Parthenon"), "The Arena"))
        countryList["Croatia"]?.addQuestion(Question("What is the name of the Croatian footballer who won the Ballon d'Or in 2018?", arrayListOf("Luka Modrić", "Ivan Rakitić", "Mario Mandžukić", "Darijo Srna"), "Luka Modrić"))
        countryList["Croatia"]?.addQuestion(Question("What is the name of the Croatian island that is a popular destination for yachting and sailing?", arrayListOf("Hvar", "Korčula", "Vis", "Brač"), "Hvar"))
        countryList["Croatia"]?.addQuestion(Question("What is the name of the famous waterfall in Croatia's Plitvice Lakes National Park?", arrayListOf("Veliki Slap", "Mali Buk", "Ciginovac", "Milanovacki Slap"), "Veliki Slap"))

        countryList["Cyprus"]?.addQuestion(Question("What is the capital city of Cyprus?", arrayListOf("Nicosia", "Limassol", "Larnaca", "Paphos"), "Nicosia"))
        countryList["Cyprus"]?.addQuestion(Question("What is the currency used in Cyprus?", arrayListOf("Euro", "Dollar", "Pound", "Lira"), "Euro"))
        countryList["Cyprus"]?.addQuestion(Question("What is the official languages spoken in Cyprus?", arrayListOf("Greek and Turkish", "Greek only", "Turkish only", "English only"), "Greek and Turkish"))
        countryList["Cyprus"]?.addQuestion(Question("Which famous Greek mythological figure is associated with Cyprus?", arrayListOf("Aphrodite", "Zeus", "Apollo", "Athena"), "Aphrodite"))
        countryList["Cyprus"]?.addQuestion(Question("What is the highest mountain in Cyprus?", arrayListOf("Mount Olympus", "Mount Troodos", "Mount Ida", "Mount Athos"), "Mount Olympus"))

        countryList["Czech Republic"]?.addQuestion(Question("What is the capital city of the Czech Republic?", arrayListOf("Prague", "Brno", "Ostrava", "Plzeň"), "Prague"))
        countryList["Czech Republic"]?.addQuestion(Question("What is the famous clock tower located in Prague called?", arrayListOf("Prague Astronomical Clock", "Charles Bridge Tower", "Old Town Bridge Tower", "Powder Tower"), "Prague Astronomical Clock"))
        countryList["Czech Republic"]?.addQuestion(Question("What is the name of the Czech currency?", arrayListOf("Czech koruna", "Euro", "Czech dollar", "Pound sterling"), "Czech koruna"))
        countryList["Czech Republic"]?.addQuestion(Question("Which river runs through Prague?", arrayListOf("Vltava", "Elbe", "Danube", "Sava"), "Vltava"))
        countryList["Czech Republic"]?.addQuestion(Question("What is the most popular beer brand in the Czech Republic?", arrayListOf("Pilsner Urquell", "Budweiser Budvar", "Staropramen", "Gambrinus"), "Pilsner Urquell"))

        countryList["Denmark"]?.addQuestion(Question("What is the name of the famous statue in Copenhagen depicting a mermaid?", arrayListOf("The Little Mermaid", "Ariel", "Ursula", "The Sea Maiden"), "The Little Mermaid"))
        countryList["Denmark"]?.addQuestion(Question("What is the name of the Danish currency?", arrayListOf("Krone", "Euro", "Dollar", "Pound"), "Krone"))
        countryList["Denmark"]?.addQuestion(Question("Which famous writer was born in Denmark in 1805?", arrayListOf("Hans Christian Andersen", "William Shakespeare", "Charles Dickens", "Mark Twain"), "Hans Christian Andersen"))
        countryList["Denmark"]?.addQuestion(Question("What is the highest point in Denmark?", arrayListOf("Møllehøj", "Ejer Bavnehøj", "Yding Skovhøj", "Søsterhøj"), "Møllehøj"))
        countryList["Denmark"]?.addQuestion(Question("What is the national dish of Denmark?", arrayListOf("Stegt flæsk med persillesovs", "Frikadeller", "Smørrebrød", "Æbleflæsk"), "Stegt flæsk med persillesovs"))

        countryList["Estonia"]?.addQuestion(Question("What is the capital city of Estonia?", arrayListOf("Tallinn", "Tartu", "Pärnu", "Narva"), "Tallinn"))
        countryList["Estonia"]?.addQuestion(Question("What is Estonia's national flower?", arrayListOf("Cornflower", "Lily of the Valley", "Forget-Me-Not", "Daisy"), "Cornflower"))
        countryList["Estonia"]?.addQuestion(Question("What is the name of Estonia's highest peak?", arrayListOf("Suur Munamägi", "Väike Munamägi", "Panga Pank", "Toompea Hill"), "Suur Munamägi"))
        countryList["Estonia"]?.addQuestion(Question("Which sea is Estonia located on?", arrayListOf("Baltic Sea", "Mediterranean Sea", "Black Sea", "Caspian Sea"), "Baltic Sea"))
        countryList["Estonia"]?.addQuestion(Question("What is the name of the famous Estonian composer who created the music for \"Für Elise\"?", arrayListOf("Ludwig van Beethoven", "Johann Sebastian Bach", "Wolfgang Amadeus Mozart", "Felix Mendelssohn"), "Ludwig van Beethoven"))

        countryList["Finland"]?.addQuestion(Question("What is the capital city of Finland?", arrayListOf("Helsinki", "Tampere", "Turku", "Oulu"),"Helsinki"))
        countryList["Finland"]?.addQuestion(Question("What is the name of the traditional Finnish sauna?", arrayListOf("Löyly", "Kiulu", "Kiuas", "Saunakko"),"Sauna"))
        countryList["Finland"]?.addQuestion(Question("What is the name of the Finnish Santa Claus?", arrayListOf("Joulupukki", "Tonttu", "Poro", "Kaneli"),"Joulupukki"))
        countryList["Finland"]?.addQuestion(Question("What is the name of the Finnish national epic poem?", arrayListOf("Kalevala", "Iliad", "Beowulf", "Divine Comedy"),"Kalevala"))
        countryList["Finland"]?.addQuestion(Question("What is the most popular sport in Finland?", arrayListOf("Ice hockey", "Football", "Basketball", "Tennis"),"Ice hockey"))

        countryList["France"]?.addQuestion(Question("What is the capital city of France?", arrayListOf("Paris", "Marseille", "Lyon", "Bordeaux"), "Paris"))
        countryList["France"]?.addQuestion(Question("What is the name of the river that flows through Paris?", arrayListOf("Seine", "Loire", "Rhine", "Thames"), "Seine"))
        countryList["France"]?.addQuestion(Question("What is the name of the famous tower in Paris?", arrayListOf("Eiffel Tower", "Louvre Pyramid", "Arc de Triomphe", "Notre-Dame"), "Eiffel Tower"))
        countryList["France"]?.addQuestion(Question("What is the name of the famous art museum in Paris?", arrayListOf("Louvre", "Musee d'Orsay", "Centre Pompidou", "Musee Rodin"), "Louvre"))
        countryList["France"]?.addQuestion(Question("What is the name of the famous palace in Versailles?", arrayListOf("Palace of Versailles", "Chateau de Chambord", "Fontainebleau", "Chateau de Chenonceau"), "Palace of Versailles"))

        countryList["Germany"]?.addQuestion(Question("What is the capital city of Germany?", arrayListOf("Berlin", "Munich", "Frankfurt", "Hamburg"), "Berlin"))
        countryList["Germany"]?.addQuestion(Question("What is the highest mountain in Germany?", arrayListOf("Zugspitze", "Watzmann", "Feldberg", "Grossglockner"), "Zugspitze"))
        countryList["Germany"]?.addQuestion(Question("Which river runs through Berlin?", arrayListOf("Spree", "Rhine", "Danube", "Elbe"), "Spree"))
        countryList["Germany"]?.addQuestion(Question("What is the name of the famous beer festival held annually in Munich?", arrayListOf("Oktoberfest", "Karneval", "Starkbierfest", "Frühlingsfest"), "Oktoberfest"))
        countryList["Germany"]?.addQuestion(Question("What is the name of the famous medieval castle located in Bavaria?", arrayListOf("Neuschwanstein", "Hohenzollern", "Lichtenstein", "Eltz"), "Neuschwanstein"))
        countryList["Germany"]?.addQuestion(Question("Which German car manufacturer is known for producing the iconic Beetle?", arrayListOf("Volkswagen", "Mercedes-Benz", "BMW", "Audi"), "Volkswagen"))
        countryList["Germany"]?.addQuestion(Question("What is the name of the historic gate located in Berlin?", arrayListOf("Brandenburg Gate", "Reichstag Gate", "Checkpoint Charlie", "Berlin Wall"), "Brandenburg Gate"))
        countryList["Germany"]?.addQuestion(Question("Who was the famous German composer known for his classical music compositions?", arrayListOf("Ludwig van Beethoven", "Johann Sebastian Bach", "Wolfgang Amadeus Mozart", "Richard Wagner"), "Ludwig van Beethoven"))

        countryList["Greece"]?.addQuestion(Question("What is the capital city of Greece?", arrayListOf("Athens", "Thessaloniki", "Patras", "Heraklion"), "Athens"))
        countryList["Greece"]?.addQuestion(Question("What is the name of the highest mountain in Greece?", arrayListOf("Mount Olympus", "Mount Pelion", "Mount Parnassus", "Mount Taygetus"), "Mount Olympus"))
        countryList["Greece"]?.addQuestion(Question("Which sea is Greece located on?", arrayListOf("Mediterranean Sea", "Adriatic Sea", "Ionian Sea", "Aegean Sea"), "Mediterranean Sea"))
        countryList["Greece"]?.addQuestion(Question("What is the name of the famous temple in Athens dedicated to the goddess Athena?", arrayListOf("Parthenon", "Acropolis", "Erechtheion", "Temple of Olympian Zeus"), "Parthenon"))
        countryList["Greece"]?.addQuestion(Question("What is the name of the famous Greek epic poem attributed to Homer?", arrayListOf("Iliad", "Odyssey", "Aeneid", "Metamorphoses"), "Iliad"))

        countryList["Hungary"]?.addQuestion(Question("What is the capital city of Hungary?", arrayListOf("Budapest", "Debrecen", "Szeged", "Pécs"), "Budapest"))
        countryList["Hungary"]?.addQuestion(Question("What is the name of the largest lake in Hungary?", arrayListOf("Lake Balaton", "Lake Hévíz", "Lake Velence", "Lake Tisza"), "Lake Balaton"))
        countryList["Hungary"]?.addQuestion(Question("What is the Hungarian name for the Hungarian Parliament building?", arrayListOf("Országház", "Parlament", "Képviselőház", "Szenátus"), "Országház"))
        countryList["Hungary"]?.addQuestion(Question("What is the name of the famous Hungarian composer who wrote 'Hungarian Rhapsody No. 2'?", arrayListOf("Franz Liszt", "Béla Bartók", "Zoltán Kodály", "György Ligeti"), "Franz Liszt"))
        countryList["Hungary"]?.addQuestion(Question("What is the name of the traditional Hungarian stew made with paprika and meat?", arrayListOf("Goulash", "Pörkölt", "Halászlé", "Tokány"), "Goulash"))

        countryList["Iceland"]?.addQuestion(Question("What is the capital city of Iceland?", arrayListOf("Reykjavik", "Kopavogur", "Hafnarfjordur", "Akureyri"), "Reykjavik"))
        countryList["Iceland"]?.addQuestion(Question("What is the name of the famous geyser in Iceland?", arrayListOf("Geysir", "Eyjafjallajokull", "Vatnajokull", "Gullfoss"), "Geysir"))
        countryList["Iceland"]?.addQuestion(Question("What is the name of the largest glacier in Iceland?", arrayListOf("Vatnajokull", "Eyjafjallajokull", "Snaefellsjokull", "Mýrdalsjökull"), "Vatnajokull"))
        countryList["Iceland"]?.addQuestion(Question("What is the name of the famous Icelandic waterfall located in the south?", arrayListOf("Seljalandsfoss", "Gullfoss", "Dettifoss", "Skogafoss"), "Skogafoss"))
        countryList["Iceland"]?.addQuestion(Question("What is the name of the traditional Icelandic fermented shark dish?", arrayListOf("Hakarl", "Skyr", "Plokkfiskur", "Hangikjot"), "Hakarl"))

        countryList["Ireland"]?.addQuestion(Question("What is the capital city of Ireland?", arrayListOf("Dublin", "Cork", "Galway", "Limerick"), "Dublin"))
        countryList["Ireland"]?.addQuestion(Question("What is the traditional Irish instrument?", arrayListOf("Uilleann pipes", "Accordion", "Fiddle", "Banjo"), "Uilleann pipes"))
        countryList["Ireland"]?.addQuestion(Question("What is the name of the famous Irish beer?", arrayListOf("Guinness", "Heineken", "Budweiser", "Stella Artois"), "Guinness"))
        countryList["Ireland"]?.addQuestion(Question("What is the name of the famous Irish castle?", arrayListOf("Blarney Castle", "Edinburgh Castle", "Windsor Castle", "Leeds Castle"), "Blarney Castle"))
        countryList["Ireland"]?.addQuestion(Question("What is the traditional Irish dance called?", arrayListOf("Riverdance", "Tap dance", "Ballet", "Hip hop"), "Riverdance"))

        countryList["Italy"]?.addQuestion(Question("What is the capital city of Italy?", arrayListOf("Rome", "Milan", "Naples", "Florence"),"Rome"))
        countryList["Italy"]?.addQuestion(Question("What is the name of the famous tower in Pisa?", arrayListOf("Leaning Tower of Pisa", "Eiffel Tower", "Big Ben", "Tower Bridge"),"Leaning Tower of Pisa"))
        countryList["Italy"]?.addQuestion(Question("What is the name of the largest island in the Mediterranean?", arrayListOf("Sicily", "Corsica", "Sardinia", "Ibiza"),"Sicily"))
        countryList["Italy"]?.addQuestion(Question("What is the name of the famous canal in Venice?", arrayListOf("Grand Canal", "Suez Canal", "Panama Canal", "Kiel Canal"),"Grand Canal"))
        countryList["Italy"]?.addQuestion(Question("What is the name of the famous ancient Roman arena in Verona?", arrayListOf("Verona Arena", "Colosseum", "Pantheon", "Trevi Fountain"),"Verona Arena"))

        countryList["Kosovo"]?.addQuestion(Question("What is the capital city of Kosovo?", arrayListOf("Pristina", "Peja", "Prizren", "Mitrovica"),"Pristina"))
        countryList["Kosovo"]?.addQuestion(Question("What is the official language of Kosovo?", arrayListOf("Albanian", "Serbian", "English", "Turkish"), "Albanian"))
        countryList["Kosovo"]?.addQuestion(Question("What is the name of the largest lake in Kosovo?", arrayListOf("Gazivoda", "Badovac", "Liqenit", "Mirusha"), "Gazivoda"))
        countryList["Kosovo"]?.addQuestion(Question("What is the name of the historical monument in Kosovo that is also a UNESCO World Heritage site?", arrayListOf("Gračanica Monastery", "Gjakova Fortress", "Ulpiana Ruins", "Skanderbeg Square"), "Gračanica Monastery"))
        countryList["Kosovo"]?.addQuestion(Question("What is the name of the traditional Albanian hat that is commonly worn in Kosovo?", arrayListOf("Qeleshe", "Fez", "Kufi", "Taqiyah"), "Qeleshe"))

        countryList["Latvia"]?.addQuestion(Question("What is the capital city of Latvia?", arrayListOf("Riga", "Daugavpils", "Liepaja", "Jelgava"), "Riga"))
        countryList["Latvia"]?.addQuestion(Question("Which sea borders Latvia to the west?", arrayListOf("Baltic Sea", "Mediterranean Sea", "Adriatic Sea", "Black Sea"), "Baltic Sea"))
        countryList["Latvia"]?.addQuestion(Question("What is the name of the Latvian currency?", arrayListOf("Euro", "Lats", "Dollar", "Pound"), "Euro"))
        countryList["Latvia"]?.addQuestion(Question("What is the traditional Latvian liqueur made from black balsam?", arrayListOf("Riga Black Balsam", "Jagermeister", "Bailey's Irish Cream", "Jack Daniel's"), "Riga Black Balsam"))
        countryList["Latvia"]?.addQuestion(Question("What is the name of the Latvian national epic poem?", arrayListOf("Lāčplēsis", "Kalevala", "The Odyssey", "Beowulf"), "Lāčplēsis"))

        countryList["Lithuania"]?.addQuestion(Question("What is the capital city of Lithuania?", arrayListOf("Vilnius", "Kaunas", "Klaipėda", "Šiauliai"), "Vilnius"))
        countryList["Lithuania"]?.addQuestion(Question("What is the name of Lithuania's national park located on the Curonian Spit?", arrayListOf("Kuršių Nerija National Park", "Trakai Historical National Park", "Aukštaitija National Park", "Žemaitija National Park"), "Kuršių Nerija National Park"))
        countryList["Lithuania"]?.addQuestion(Question("What is the name of Lithuania's traditional cold beet soup?", arrayListOf("Šaltibarščiai", "Cepelinai", "Kugelis", "Balandėliai"), "Šaltibarščiai"))
        countryList["Lithuania"]?.addQuestion(Question("What is the name of the hill in Vilnius that is home to three Orthodox churches?", arrayListOf("Three Crosses Hill", "Gediminas Hill", "Castle Hill", "Bernardine Garden Hill"), "Three Crosses Hill"))
        countryList["Lithuania"]?.addQuestion(Question("What is the name of Lithuania's national basketball team?", arrayListOf("Žalgiris", "Lietuvos Rytas", "Neptūnas", "Lietuva"), "Lietuva"))


        countryList["Malta"]?.addQuestion(Question("What is the capital city of Malta?", arrayListOf("Valletta", "Birkirkara", "Qormi", "Sliema"), "Valletta"))
        countryList["Malta"]?.addQuestion(Question("What is the name of the ancient megalithic temple complex in Malta that is a UNESCO World Heritage Site?", arrayListOf("Mnajdra", "Hagar Qim", "Tarxien", "Ggantija"), "Mnajdra"))
        countryList["Malta"]?.addQuestion(Question("What is the name of the traditional Maltese fishing boat?", arrayListOf("Luzzu", "Frigatina", "Dghajsa", "Barca"), "Luzzu"))
        countryList["Malta"]?.addQuestion(Question("Which of the following is not an official language of Malta?", arrayListOf("Spanish", "Maltese", "English", "Italian"), "Spanish"))
        countryList["Malta"]?.addQuestion(Question("What is the name of the popular Maltese pastry filled with ricotta cheese?", arrayListOf("Pastizzi", "Kannoli", "Imqaret", "Qassatat"), "Pastizzi"))

        countryList["Montenegro"]?.addQuestion(Question("What is the capital city of Montenegro?", arrayListOf("Podgorica", "Budva", "Kotor", "Herceg Novi"), "Podgorica"))
        countryList["Montenegro"]?.addQuestion(Question("What is the name of the tallest mountain in Montenegro?", arrayListOf("Bobotov Kuk", "Durmitor", "Zlatibor", "Cvijetin Brijeg"), "Bobotov Kuk"))
        countryList["Montenegro"]?.addQuestion(Question("Which sea is located on the western coast of Montenegro?", arrayListOf("Adriatic Sea", "Mediterranean Sea", "Black Sea", "Baltic Sea"), "Adriatic Sea"))
        countryList["Montenegro"]?.addQuestion(Question("What is the name of the famous bridge in the Montenegrin city of Podgorica?", arrayListOf("Millennium Bridge", "Liberty Bridge", "Freedom Bridge", "Unity Bridge"), "Millennium Bridge"))
        countryList["Montenegro"]?.addQuestion(Question("What is the name of the national park located in Montenegro?", arrayListOf("Durmitor National Park", "Biogradska Gora National Park", "Skadar Lake National Park", "Lovćen National Park"), "Durmitor National Park"))

        countryList["Moldova"]?.addQuestion(Question("What is the name of the river that runs through the capital city of Chisinau?", arrayListOf("Bîc", "Dniester", "Prut", "Danube"), "Bîc"))
        countryList["Moldova"]?.addQuestion(Question("What is the traditional alcoholic beverage of Moldova?", arrayListOf("Wine", "Beer", "Vodka", "Whiskey"), "Wine"))
        countryList["Moldova"]?.addQuestion(Question("What is the name of the largest monastery in Moldova?", arrayListOf("Capriana Monastery", "Curchi Monastery", "Hincu Monastery", "Saharna Monastery"), "Capriana Monastery"))
        countryList["Moldova"]?.addQuestion(Question("What is the name of the largest nature reserve in Moldova?", arrayListOf("Lower Dniester National Park", "Prutul de Jos Nature Reserve", "Codru Reserve", "Middle Prut Floodplain Reserve"), "Lower Dniester National Park"))
        countryList["Moldova"]?.addQuestion(Question("What is the traditional Moldovan dish consisting of cabbage rolls stuffed with meat and rice?", arrayListOf("Sarmale", "Mamaliga", "Placinte", "Frigarui"), "Sarmale"))

        countryList["Netherlands"]?.addQuestion(Question("What is the capital city of the Netherlands?", arrayListOf("Amsterdam", "Rotterdam", "Utrecht", "The Hague"), "Amsterdam"))
        countryList["Netherlands"]?.addQuestion(Question("What is the name of the famous Dutch cheese?", arrayListOf("Gouda", "Edam", "Brie", "Camembert"), "Gouda"))
        countryList["Netherlands"]?.addQuestion(Question("What is the name of the famous Dutch painter who created 'The Starry Night'?", arrayListOf("Vincent van Gogh", "Johannes Vermeer", "Rembrandt van Rijn", "Hieronymus Bosch"), "Vincent van Gogh"))
        countryList["Netherlands"]?.addQuestion(Question("What is the name of the Dutch national football team?", arrayListOf("Oranje", "The Flying Dutchmen", "The Dutch Lions", "The Orange Army"), "Oranje"))
        countryList["Netherlands"]?.addQuestion(Question("What is the name of the Dutch flower market?", arrayListOf("Bloemenmarkt", "Flower Market", "Tulip Market", "Garden Market"), "Bloemenmarkt"))

        countryList["North Macedonia"]?.addQuestion(Question("What is the capital city of North Macedonia?", arrayListOf("Skopje", "Ohrid", "Bitola", "Tetovo"), "Skopje"))
        countryList["North Macedonia"]?.addQuestion(Question("What is the name of the deepest underwater cave in the world, located in North Macedonia?", arrayListOf("Vrelo Cave", "Matka Canyon", "Galicica National Park", "Mavrovo National Park"), "Vrelo Cave"))
        countryList["North Macedonia"]?.addQuestion(Question("Which mountain range runs along North Macedonia's western border?", arrayListOf("Šar Mountains", "Pindus Mountains", "Rhodope Mountains", "Balkan Mountains"), "Šar Mountains"))
        countryList["North Macedonia"]?.addQuestion(Question("What is the name of the national park in North Macedonia that is home to the highest peak in the country, Mount Korab?", arrayListOf("Mavrovo National Park", "Galicica National Park", "Pelister National Park", "Šar National Park"), "Mavrovo National Park"))
        countryList["North Macedonia"]?.addQuestion(Question("What is the name of the traditional Macedonian cap that is part of the national costume?", arrayListOf("Tamburaš", "Tepeluk", "Pelekija", "Sintija"), "Tepeluk"))

        countryList["Norway"]?.addQuestion(Question("What is the capital city of Norway?", arrayListOf("Oslo", "Bergen", "Trondheim", "Stavanger"), "Oslo"))
        countryList["Norway"]?.addQuestion(Question("What is the name of the longest road tunnel in the world, located in Norway?", arrayListOf("Lærdal Tunnel", "Gudvanga Tunnel", "Aurland Tunnel", "Magerøya Tunnel"), "Lærdal Tunnel"))
        countryList["Norway"]?.addQuestion(Question("What is the name of the highest mountain in Norway?", arrayListOf("Galdhøpiggen", "Glittertind", "Kebnekaise", "Snøhetta"), "Galdhøpiggen"))
        countryList["Norway"]?.addQuestion(Question("What is the name of the traditional Norwegian sweater, usually made of wool and featuring a pattern of snowflakes?", arrayListOf("Lusekofte", "Mariusgenser", "Setesdalsgenser", "Hardangerbunad"), "Mariusgenser"))
        countryList["Norway"]?.addQuestion(Question("What is the name of the scenic railway that runs between Bergen and Oslo, passing through the mountains and fjords of Norway?", arrayListOf("Bergen Railway", "Flåm Railway", "Rauma Railway", "Dovre Railway"), "Bergen Railway"))

        countryList["Poland"]?.addQuestion(Question("What is the capital city of Poland?", arrayListOf("Warsaw", "Krakow", "Gdansk", "Wroclaw"), "Warsaw"))
        countryList["Poland"]?.addQuestion(Question("Which river runs through the city of Krakow?", arrayListOf("Vistula", "Odra", "Warta", "Bug"), "Vistula"))
        countryList["Poland"]?.addQuestion(Question("What is the name of the famous salt mine near Krakow?", arrayListOf("Wieliczka Salt Mine", "Bochnia Salt Mine", "Kopalnia Soli"), "Wieliczka Salt Mine"))
        countryList["Poland"]?.addQuestion(Question("What is the name of the former Nazi concentration camp in Poland?", arrayListOf("Auschwitz-Birkenau", "Treblinka", "Sobibor", "Majdanek"), "Auschwitz-Birkenau"))
        countryList["Poland"]?.addQuestion(Question("What is the name of the largest national park in Poland?", arrayListOf("Biebrza National Park", "Tatra National Park", "Bieszczady National Park", "Karkonosze National Park"), "Biebrza National Park"))
        countryList["Poland"]?.addQuestion(Question("What is the name of the famous medieval square located in Krakow?", arrayListOf("Rynek Glowny", "Old Town Square", "Wawel Square", "Krakow Market Square"), "Rynek Glowny"))

        countryList["Portugal"]?.addQuestion(Question("What is the capital city of Portugal?", arrayListOf("Lisbon", "Porto", "Funchal", "Coimbra"),"Lisbon"))
        countryList["Portugal"]?.addQuestion(Question("Which famous explorer is from Portugal?", arrayListOf("Vasco da Gama", "Christopher Columbus", "Ferdinand Magellan", "James Cook"),"Vasco da Gama"))
        countryList["Portugal"]?.addQuestion(Question("What is the name of the famous fortified wine produced in Portugal?", arrayListOf("Port Wine", "Madeira Wine", "Vinho Verde", "Bairrada Wine"),"Port Wine"))
        countryList["Portugal"]?.addQuestion(Question("What is the name of the highest mountain range in mainland Portugal?", arrayListOf("Serra da Estrela", "Serra do Gerês", "Serra da Arrábida", "Serra de Montemuro"),"Serra da Estrela"))
        countryList["Portugal"]?.addQuestion(Question("What is the name of the famous monastery in Lisbon?", arrayListOf("Jerónimos Monastery", "Batalha Monastery", "Alcobaça Monastery", "Tomar Monastery"),"Jerónimos Monastery"))

        countryList["Romania"]?.addQuestion(Question("What is the capital city of Romania?", arrayListOf("Bucharest", "Cluj-Napoca", "Timișoara", "Iași"), "Bucharest"))
        countryList["Romania"]?.addQuestion(Question("What is the name of the largest administrative building in Europe, located in Bucharest, Romania?", arrayListOf("Palace of the Parliament", "Bran Castle", "Peles Castle", "Corvin Castle"), "Palace of the Parliament"))
        countryList["Romania"]?.addQuestion(Question("Which river flows through Romania?", arrayListOf("Danube", "Rhine", "Volga", "Thames"), "Danube"))
        countryList["Romania"]?.addQuestion(Question("What is the currency of Romania?", arrayListOf("Leu", "Euro", "Dollar", "Pound"), "Leu"))
        countryList["Romania"]?.addQuestion(Question("What is the name of the famous painted monastery located in northern Romania?", arrayListOf("Voroneț Monastery", "Sucevița Monastery", "Moldovița Monastery", "Arbore Monastery"), "Voroneț Monastery"))

        countryList["Russia"]?.addQuestion(Question("What is the capital city of Russia?", arrayListOf("Moscow", "St. Petersburg", "Novosibirsk", "Yekaterinburg"), "Moscow"))
        countryList["Russia"]?.addQuestion(Question("What is the name of the famous cathedral located in Moscow, Russia?", arrayListOf("St. Basil's Cathedral", "Kazan Cathedral", "Savior on Blood Cathedral", "St. Isaac's Cathedral"), "St. Basil's Cathedral"))
        countryList["Russia"]?.addQuestion(Question("Which mountain range forms the natural border between Russia and Georgia?", arrayListOf("Caucasus Mountains", "Ural Mountains", "Alps", "Himalayas"), "Caucasus Mountains"))
        countryList["Russia"]?.addQuestion(Question("What is the currency of Russia?", arrayListOf("Ruble", "Euro", "Dollar", "Pound"), "Ruble"))
        countryList["Russia"]?.addQuestion(Question("What is the name of the famous art museum located in St. Petersburg, Russia?", arrayListOf("Hermitage Museum", "Tretyakov Gallery", "Pushkin Museum", "Russian Museum"), "Hermitage Museum"))
        countryList["Russia"]?.addQuestion(Question("What is the longest river in Russia?", arrayListOf("Volga River", "Yenisei River", "Ob River", "Lena River"), "Volga River"))
        countryList["Russia"]?.addQuestion(Question("Which famous ballet company is based in Russia?", arrayListOf("Bolshoi Ballet", "Mariinsky Ballet", "Paris Opera Ballet", "Royal Ballet"), "Bolshoi Ballet"))
        countryList["Russia"]?.addQuestion(Question("What is the traditional Russian beverage made from fermented cereal grains?", arrayListOf("Kvass", "Vodka", "Mead", "Sbiten"), "Kvass"))

        countryList["Serbia"]?.addQuestion(Question("What is the capital city of Serbia?", arrayListOf("Belgrade", "Novi Sad", "Nis", "Kragujevac"), "Belgrade"))
        countryList["Serbia"]?.addQuestion(Question("What is the official language of Serbia?", arrayListOf("Serbian", "Croatian", "Bosnian", "Montenegrin"), "Serbian"))
        countryList["Serbia"]?.addQuestion(Question("Which river runs through Belgrade?", arrayListOf("Danube", "Sava", "Drina", "Morava"), "Danube"))
        countryList["Serbia"]?.addQuestion(Question("What is the name of the famous fortress located in Belgrade?", arrayListOf("Kalemegdan Fortress", "Golubac Fortress", "Nis Fortress", "Petrovaradin Fortress"), "Kalemegdan Fortress"))
        countryList["Serbia"]?.addQuestion(Question("What is the traditional Serbian music known as?", arrayListOf("Gusle", "Kolo", "Turbofolk", "Sevdalinka"), "Gusle"))
        countryList["Serbia"]?.addQuestion(Question("Which Serbian scientist and inventor is known for his contributions to alternating current (AC) electrical systems?", arrayListOf("Nikola Tesla", "Mihajlo Pupin", "Milutin Milankovic", "Ivo Andric"), "Nikola Tesla"))
        countryList["Serbia"]?.addQuestion(Question("Which Serbian tennis player has won multiple Grand Slam titles?", arrayListOf("Novak Djokovic", "Ana Ivanovic", "Jelena Jankovic", "Viktor Troicki"), "Novak Djokovic"))
        countryList["Serbia"]?.addQuestion(Question("What is the traditional Serbian dish made of ground meat, onions, and spices, often served with kajmak?", arrayListOf("Cevapi", "Sarma", "Pljeskavica", "Musaka"), "Cevapi"))


        countryList["Slovakia"]?.addQuestion(Question("What is the capital city of Slovakia?", arrayListOf("Bratislava", "Kosice", "Poprad", "Nitra"), "Bratislava"))
        countryList["Slovakia"]?.addQuestion(Question("Which river runs through Bratislava?", arrayListOf("Danube", "Vltava", "Tisa", "Morava"), "Danube"))
        countryList["Slovakia"]?.addQuestion(Question("What is the highest mountain in Slovakia?", arrayListOf("Gerlachovský štít", "Lomnický štít", "Krivan", "Rysy"), "Gerlachovský štít"))
        countryList["Slovakia"]?.addQuestion(Question("What is the name of the Slovak currency?", arrayListOf("Euro", "Koruna", "Lira", "Dollar"), "Euro"))
        countryList["Slovakia"]?.addQuestion(Question("What is the name of the biggest Slovakian national park?", arrayListOf("Tatra National Park", "Low Tatras National Park", "Slovak Paradise National Park", "Pieniny National Park"), "Tatra National Park"))

        countryList["Slovenia"]?.addQuestion(Question("What is the capital city of Slovenia?", arrayListOf("Ljubljana", "Maribor", "Celje", "Kranj"), "Ljubljana"))
        countryList["Slovenia"]?.addQuestion(Question("Which mountain range runs through Slovenia?", arrayListOf("Julian Alps", "Carpathian Mountains", "Dinaric Alps", "Pyrenees"), "Julian Alps"))
        countryList["Slovenia"]?.addQuestion(Question("What is the name of the Slovenian coastline on the Adriatic Sea?", arrayListOf("Slovenian Riviera", "Istria", "Dalmatia", "Makarska Riviera"), "Slovenian Riviera"))
        countryList["Slovenia"]?.addQuestion(Question("What is the name of the Slovenian national park that is famous for its underground caves?", arrayListOf("Postojna Cave National Park", "Triglav National Park", "Krka National Park", "Plitvice Lakes National Park"), "Postojna Cave National Park"))
        countryList["Slovenia"]?.addQuestion(Question("What is the name of the Slovenian dish that is made of boiled potatoes and turnip?", arrayListOf("Bograč", "Idrijski žlikrofi", "Jota", "Blejska kremna rezina"), "Jota"))

        countryList["Spain"]?.addQuestion(Question("What is the capital city of Spain?", arrayListOf("Madrid", "Barcelona", "Valencia", "Seville"),"Madrid"))
        countryList["Spain"]?.addQuestion(Question("What is the name of the famous Spanish festival which involves the running of the bulls?", arrayListOf("San Fermin", "La Tomatina", "Las Fallas", "Carnival of Santa Cruz de Tenerife"),"San Fermin"))
        countryList["Spain"]?.addQuestion(Question("What is the name of the famous Spanish dish made of rice, saffron, and various seafood?", arrayListOf("Paella", "Tapas", "Churros", "Gazpacho"),"Paella"))
        countryList["Spain"]?.addQuestion(Question("Which famous Spanish architect designed the Sagrada Familia in Barcelona?", arrayListOf("Antoni Gaudí", "Frank Gehry", "Zaha Hadid", "I. M. Pei"),"Antoni Gaudí"))
        countryList["Spain"]?.addQuestion(Question("Which famous Spanish painter is known for his masterpiece painting 'Guernica'?", arrayListOf("Pablo Picasso", "Diego Velázquez", "Francisco Goya", "Joan Miró"),"Pablo Picasso"))

        countryList["Sweden"]?.addQuestion(Question("What is the capital city of Sweden?", arrayListOf("Stockholm", "Gothenburg", "Malmö", "Uppsala"),"Stockholm"))
        countryList["Sweden"]?.addQuestion(Question("Which popular furniture brand is from Sweden?", arrayListOf("IKEA", "H&M", "Volvo", "Ericsson"),"IKEA"))
        countryList["Sweden"]?.addQuestion(Question("What is the name of the famous Swedish music group which produced 'Dancing Queen'?", arrayListOf("ABBA", "Ace of Base", "Roxette", "Europe"),"ABBA"))
        countryList["Sweden"]?.addQuestion(Question("Which Swedish scientist is known for discovering the chemical element oxygen?", arrayListOf("Carl Wilhelm Scheele", "Jöns Jacob Berzelius", "Alfred Nobel", "Anders Celsius"),"Carl Wilhelm Scheele"))
        countryList["Sweden"]?.addQuestion(Question("What is the name of the Swedish festival which celebrates the summer solstice?", arrayListOf("Midsummer", "Christmas", "Easter", "Halloween"),"Midsummer"))

        countryList["Switzerland"]?.addQuestion(Question("What is the name of the mountain in Switzerland that is famous for its chocolate?", arrayListOf("Matterhorn", "Eiger", "Jungfrau", "Mont Blanc"), "Matterhorn"))
        countryList["Switzerland"]?.addQuestion(Question("What is the name of the largest Swiss city by population?", arrayListOf("Zürich", "Geneva", "Basel", "Bern"), "Zürich"))
        countryList["Switzerland"]?.addQuestion(Question("What is the name of the Swiss cheese with holes?", arrayListOf("Emmental", "Gruyere", "Appenzeller", "Tête de Moine"), "Emmental"))
        countryList["Switzerland"]?.addQuestion(Question("What is the name of the famous Swiss tennis player who won 20 Grand Slam titles?", arrayListOf("Roger Federer", "Stan Wawrinka", "Martina Hingis", "Belinda Bencic"), "Roger Federer"))
        countryList["Switzerland"]?.addQuestion(Question("What is the name of the Swiss national dish made from potatoes, cheese, and onions?", arrayListOf("Rösti", "Fondue", "Raclette", "Zürcher Geschnetzeltes"), "Rösti"))

        countryList["Ukraine"]?.addQuestion(Question("What is the capital city of Ukraine?", arrayListOf("Kyiv", "Lviv", "Odessa", "Kharkiv"), "Kyiv"))
        countryList["Ukraine"]?.addQuestion(Question("What is the name of the Ukrainian traditional dance?", arrayListOf("Hopak", "Kozachok", "Gopak", "Kolomyika"), "Hopak"))
        countryList["Ukraine"]?.addQuestion(Question("What is the name of the Ukrainian national instrument?", arrayListOf("Bandura", "Kobza", "Balalaika", "Gusli"), "Bandura"))
        countryList["Ukraine"]?.addQuestion(Question("What is the name of the Ukrainian soup made with beetroots?", arrayListOf("Borscht", "Solyanka", "Shchi", "Okroshka"), "Borscht"))
        countryList["Ukraine"]?.addQuestion(Question("What is the name of the Ukrainian city that is famous for its beautiful Orthodox churches?", arrayListOf("Lviv", "Odessa", "Kyiv", "Chernivtsi"), "Lviv"))
        countryList["Ukraine"]?.addQuestion(Question("What is the name of the Ukrainian writer who wrote 'The Master and Margarita'?", arrayListOf("Mikhail Bulgakov", "Ivan Turgenev", "Leo Tolstoy", "Fyodor Dostoevsky"), "Mikhail Bulgakov"))

        countryList["United Kingdom"]?.addQuestion(Question("What is the capital city of the United Kingdom?", arrayListOf("London", "Manchester", "Birmingham", "Liverpool"), "London"))
        countryList["United Kingdom"]?.addQuestion(Question("What is the currency of the United Kingdom?", arrayListOf("Pound Sterling", "Euro", "Dollar", "Yen"), "Pound Sterling"))
        countryList["United Kingdom"]?.addQuestion(Question("What is the name of the famous bell located in the clock tower of the Palace of Westminster in London?", arrayListOf("Big Ben", "Westminster Bell", "Tower Bell", "London Bell"), "Big Ben"))
        countryList["United Kingdom"]?.addQuestion(Question("What is the national dish of the United Kingdom?", arrayListOf("Fish and Chips", "Roast Beef and Yorkshire Pudding", "Shepherd's Pie", "Bangers and Mash"), "Fish and Chips"))
        countryList["United Kingdom"]?.addQuestion(Question("What is the name of the famous university located in Cambridge, England?", arrayListOf("University of Cambridge", "Oxford University", "Imperial College London", "University of London"), "University of Cambridge"))

        countryList["Vatican City"]?.addQuestion(Question("What is the capital city of Vatican City?", arrayListOf("Vatican City", "Rome", "Naples", "Milan"), "Vatican City"))
        countryList["Vatican City"]?.addQuestion(Question("What is the official language of Vatican City?", arrayListOf("Latin", "Italian", "English", "French"), "Latin"))
        countryList["Vatican City"]?.addQuestion(Question("What is the name of the current Pope?", arrayListOf("Pope Francis", "Pope Benedict XVI", "Pope John Paul II", "Pope Paul VI"), "Pope Francis"))
        countryList["Vatican City"]?.addQuestion(Question("What is the name of the famous church located in Vatican City?", arrayListOf("St. Peter's Basilica", "St. Paul's Cathedral", "Notre-Dame Cathedral", "Westminster Abbey"), "St. Peter's Basilica"))
        countryList["Vatican City"]?.addQuestion(Question("What is the name of the famous museum located in Vatican City?", arrayListOf("Vatican Museums", "Louvre Museum", "British Museum", "Metropolitan Museum of Art"), "Vatican Museums"))
    }

    fun getCountry(name: String) : Country?
    {
        return countryList[name]
    }

    fun getCountry(color: Int) : Country? {
        for (country in countryList)
            if(country.value.color == color)
                return country.value
        return null
    }
}