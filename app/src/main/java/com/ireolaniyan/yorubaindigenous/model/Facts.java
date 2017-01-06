package com.ireolaniyan.yorubaindigenous.model;

import com.ireolaniyan.yorubaindigenous.R;

/**
 * Created by Ire Olaniyan on 12/13/2016.
 */
public class Facts {
    private Page mPages[];

    public Facts(){
        mPages = new Page[32];

        mPages[0] = new Page(
                R.mipmap.page_0,
                "Lagos State is the most populous state in Nigeria but the smallest in land area. The famous yellow buses, widely known as Danfo which means \"hurry\" in Yoruba is the major mode of transportation. The capital of Lagos is Ikeja.",
                new Choice("Next", 1)
        );
        mPages[1] = new Page(
                R.mipmap.page_1,
                "The longest bridge in Africa, 3rd Mainland Bridge is from the state. The bridge which connects Lagos Island to the Mainland is 11.8km long. Other bridges such as Eko Bridge, Carter Bridge and the Lekki-Ikoyi link Bridge are also major landmarks. Announcements have been made for a 4th Mainland Bridge.",
                new Choice("Next", 2)
        );
        mPages[2] = new Page(
                R.mipmap.page_2,
                "Lagos is home to the tallest building in West Africa. Built in 1979, the NECOM House towers 160m above the city and serves as a beacon for the Lagos harbor.",
                new Choice("Next", 3)
        );
        mPages[3] = new Page(
                R.mipmap.page_3,
                "It has a floating city. Not quite Venice, but Makoko manages to make a floating city out of a makeshift community. The entire city is built over water on stilts and people travel through the waterways on small boats. In 2013, a floating school that runs on solar power was built in the middle of the city.",
                new Choice("Next", 4)
        );
        mPages[4] = new Page(
                R.mipmap.page_4,
                "Construction of the best prime real estate in West Africa, Eko Atlantic City started in 2008. It is being built on reclaimed land off Ahmadu Bello Way on Victoria Island into the Atlantic Ocean. It is one of Africa's biggest marine engineering projects. The new island will accommodate 250,000 residents and 150,000 commuters. A sea barrier, fondly referred to as the \"Great Wall of Lagos\" is being built to protect the city against ocean surge.",
                new Choice("Next", 5)
        );
        mPages[5] = new Page(
                R.mipmap.page_5,
                "The massive ports of Lagos are able to handle 80% of all of Nigeria's imports, as well as over 70% of the country's exports. It also cracks the list of top 10 largest ports in Africa. This is Lagos, the CENTRE OF EXCELLENCE.",
                new Choice("Next State", 6)
        );
        mPages[6] = new Page(
                R.mipmap.page_6,
                "Ekiti derived her name from \"Ile olokiti\" which means the Land of Hills, due to the presence of many hills in the place. It was declared a state on 1 October 1996. Ekiti state is reputed to have produced the highest number of professors in Nigeria, including the first Professor of Architecture in Africa. Ado Ekiti is the capital of Ekiti state.",
                new Choice("Next", 7)
        );
        mPages[7] = new Page(
                R.mipmap.page_7,
                "The people of Ekiti state have their own unique way of dressing, dancing, festival, religion and other ways of life. Their best food is Iyan (Pounded Yam) with Egusi (Melon soup) or Efo (Vegetable soup) and Bush Meat.",
                new Choice("Next", 8)
        );
        mPages[8] = new Page(
                R.mipmap.page_8,
                "In the heart of Ikogosi, a small town, lies a warm spring. A cold spring flows beside this warm spring, meeting it at a confluence with each maintaining its thermal properties. The spring is at present being processed and packaged into bottled water for commercial purposes by a private company - UAC Nigeria.",
                new Choice("Next", 9)
        );
        mPages[9] = new Page(
                R.mipmap.page_9,
                "The land is buoyant in agricultural resources with cocoa as its leading cash crop. It was largely known that Ekiti land constituted well over 40% of the cocoa products of the famous old Western Region.",
                new Choice("Next", 10)
        );
//        TODO: Fajuyi mem park.
        mPages[10] = new Page(
                R.mipmap.page_10,
                "The Fajuyi Memorial Park situated in Ado Ekiti . Ekiti, LAND OF HONOUR.",
                new Choice("Next State", 11)
        );
        mPages[11] = new Page(
                R.mipmap.page_11,
                "Ogun State was created in February 1976 with it's name gotten from the Ogun river that flows through it. Abeokuta, the capital and largest city in the state is home to the famous tourist attraction - Olumo Rock. Ogun state has several local and international businesses and factories cited within it which includes the multi-million Naira cement factory in Sagamu - the largest cement factory in West Africa and the Ewekoro cement factory.",
                new Choice("Next", 12)
        );
        mPages[12] = new Page(
                R.mipmap.page_12,
                "Ofada rice is grown almost exclusively in Ogun State. It is named after the town \"Ofada\" in the state where it was first grown by a soldier in the 1940s. However, it is not indigenous to Africa.",
                new Choice("Next", 13)
        );
        mPages[13] = new Page(
                R.mipmap.page_13,
                "Ogun state is known to have the highest number of tertiary institutions in Nigeria. It has one Federal university, two state universities and five private universities which include Covenant University and Babcock University - the first private university in Nigeria. Among these are also Polytechnics and Colleges of Education.",
                new Choice("Next", 14)
        );
        mPages[14] = new Page(
                R.mipmap.page_14,
                "The Ijebus in the state were the first Yoruba speaking people to have contact with the Europeans in the early 14th century. They were the first Yorubas to have invented money made from cowry shells called \"Owo Eyo\", which was later replaced by legal tender coins when the Europeans came. The popular Ijebu garri (white garri) is made here. There were talks in recent times of making Ijebu a state of its own.",
                new Choice("Next", 15)
        );
        mPages[15] = new Page(
                R.mipmap.page_15,
                "The state is famous for it's Batik, known as Adire (tye-and-dye) textile products and also the Aso-Oke materials which are very colourful and eye-catching. Ogun state is nicknamed the GATEWAY STATE.",
                new Choice("Next State", 16)
        );
        mPages[16] = new Page(
                R.mipmap.page_16,
                "The State of Osun derived its name from the River Osun, a deified natural spring where annual traditional festivities are held. In the capital - Osogbo, the Osun-Osogbo Festival which takes place at the Osun-Osogbo Grove - a UNESCO World Heritage Site(2005) is one of the popular festivals held every August. It has been celebrated for about 600 centuries",
                new Choice("Next", 17)
        );
        mPages[17] = new Page(
                R.mipmap.page_17,
                "The people of the state trace their origin to Oduduwa and the town of Ile-Ife. Ile-Ife, the cradle of the Yoruba nation is an important center of political and religious development for Yoruba culture. It has the sites of the Oranmiyan Staff, Ife Museum as well as the old City Walls - these are the relics of walls built to protect Ile-Ife from being invaded by enemies.",
                new Choice("Next", 18)
        );
        mPages[18] = new Page(
                R.mipmap.page_18,
                "A 42-feet tall statue of Moremi Ajaroso, located in Ile-Ife was unveiled by the Ooni of Ife in 2016. Moremi was a brave princess and heroine who liberated the Yoruba people from slave invaders. The statue is the tallest in Nigeria and the 3rd tallest in Africa. It was 100% locally constructed by Nigerian engineers with sole Nigerian materials.",
                new Choice("Next", 19)
        );
        mPages[19] = new Page(
                R.mipmap.page_19,
                "Located in Erin-Ijesha, the Oluminrin Waterfalls is a seven-layer waterfall and only a few visitors climb beyond the second layer. Each step of the waterfall has a flowing fountain. It is an ideal place for picnic and relaxation.",
                new Choice("Next", 20)
        );
        mPages[20] = new Page(
                R.mipmap.page_20,
                "Transportation in the state is either by road or rail. The Osun state government usually offers free train rides to the state's indigenes during festive periods. This initiative is to lessen the financial burden of transportation and allow those who live and work in Lagos to return home to celebrate with their relatives. Osun is the LAND OF VIRTUE.",
                new Choice("Next State", 21)
        );
        mPages[21] = new Page(
                R.mipmap.page_21,
                "Ondo State, home to one of the most beautiful natural landscapes in Nigeria - Idanre Hills. It resides 3000ft above sea level and houses a unique ecosystem. A great tree is seen at the entrance of the ancient city of Idanre called the IRAYE TREE. This site was added to the UNESCO World Heritage Tentative List on October 8, 2007 in the Cultural category. Akure is the state capital.",
                new Choice("Next", 22)
        );
        mPages[22] = new Page(
                R.mipmap.page_22,
                "The state is reputed as the education factory of Nigeria with 541 public primary schools, 74 registered private primary schools. Also the state has 141 public secondary schools and 18 registered private secondary schools while there are other 4 technical secondary schools, there are also tertiary institutions in the state.",
                new Choice("Next", 23)
        );
        mPages[23] = new Page(
                R.mipmap.page_23,
                "Aiyetoro Community of Holy Apostles, a riverine community in Ilaje, Ondo State, where the locals follow after the apostolic doctrines and where sin is a taboo. The Holy Apostles succeeded in building a prosperous town through communalism, with the inspiration of the Holy Spirit. They instituted the first communist society in Nigeria and indeed the whole of West Africa between 1948 and 1968.",
                new Choice("Next", 24)
        );
        mPages[24] = new Page(
                R.mipmap.page_24,
                "Ebomi Lake - a 1.5km long expanse of water, located in the sleepy enclave of Ipesi Akoko, along the north-eastern boundaries of Ondo State. The lake is also known as \"the bottomless lake\" because of its depth which is difficult to estimate. This lake is home to some rare species of fishes that could be seen swimming majestically in the clean water. Ondo State, a.k.a SUNSHINE STATE.",
                new Choice("Next State", 25)
        );
        mPages[25] = new Page(
                R.mipmap.page_25,
                "Ọyọ, usually referred to as Oyo State to distinguish it from the city of Oyo, is an inland state in south-western Nigeria, with its capital at Ibadan. The first university in Nigeria is the University of Ibadan (established as a college of the University of London when it was founded in 1948, and later converted into an autonomous university in 1962).",
                new Choice("Next", 26)
        );
        mPages[26] = new Page(
                R.mipmap.page_26,
                "The Oyo Empire was a Yoruba empire of what is today Western and North central Nigeria, and Eastern Benin. Established in the 15th century, the Oyo Empire grew to become one of the largest West African states, surpassing notably the Fon Kingdom of Dahomey in the modern Republic of Benin to the west.",
                new Choice("Next", 27)
        );
        mPages[27] = new Page(
                R.mipmap.page_27,
                "The Old Oyo National Park which harbours a wide variety of wildlife is one of the national parks of Nigeria, located across northern Oyo State and southern Kwara State, Nigeria. It was previously habitat for the endangered West African wild dog. The park takes its name from Oyo-lle (Old Oyo), the ancient political capital of Oyo Empire and contains the ruins of this city.",
                new Choice("Next", 28)
        );
        mPages[28] = new Page(
                R.mipmap.page_28,
                "At the palace of Soun of Ogbomosho, there is a giant male tortoise called 'Alagba' because of its years of existence. It is believed to be 330-years-old. The legendary tortoise lumbers about in the palace. 'Alagba' was allegedly brought to the palace by Soun Ikumoyede Ajao, the third Soun of Ogbomoso, believed to have been born in the late 16th century and who reigned in the 17th.",
                new Choice("Next", 29)
        );
        mPages[29] = new Page(
                R.mipmap.page_29,
                "Cocoa House, completed in 1965 at a height of 105 metres with 23 floors was once the tallest building in tropical Africa. It was the first skyscraper built in Africa. Speaking of \'firsts\', the state is also home to NTA Ibadan, the first television station in Africa, and the Obafemi Awolowo Stadium, a stadium with a capacity of 35,000. This is why Oyo State is called the PACESETTER STATE."
        );
    }

    public Page getPage(int pageNumber){
        return mPages[pageNumber];
    }
}
