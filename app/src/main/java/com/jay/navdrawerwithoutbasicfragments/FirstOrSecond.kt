package com.jay.navdrawerwithoutbasicfragments

object FirstOrSecond {
    // Arraylist and return the Arraylist
    fun getLevels(): ArrayList<Semester> {
        val level = ArrayList<Semester>()
        val level1 = Semester("100 Level")
        level.add(level1)
        val level2 = Semester("200 Level")
        level.add(level2)
        val level3 = Semester("300 Level")
        level.add(level3)
        val level4 = Semester("400 Level")
        level.add(level4)
        val level5 = Semester("500 Level")
        level.add(level5)
        return level
    }

    fun getSemesterData(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what Semester
        val semesterList = ArrayList<Semester>()
        val sem1 = Semester("First Semester")
        semesterList.add(sem1)
        val sem2 = Semester("Second Semester")
        semesterList.add(sem2)
        return semesterList
    }

    /*    fun getSessionData():ArrayList<Semester>{
        val sessionList = ArrayList<Semester>()
        val sess1 = Semester("2013/2014")
        sessionList.add(sess1)
        val sess2 = Semester("2014/2015")
        sessionList.add(sess2)
        val sess3 = Semester("2015/2016")
        sessionList.add(sess3)
        val sess4 = Semester("2016/2017")
        sessionList.add(sess4)
        val sess5 = Semester("2017/2018")
        sessionList.add(sess5)
        val sess6 = Semester("2018/2019")
        sessionList.add(sess6)
        val sess7 = Semester("2019/2020")
        sessionList.add(sess7)
        val sess8 = Semester("2020/2021")
        sessionList.add(sess8)
        val sess9 = Semester("2021/2022")
        sessionList.add(sess9)
        val sess10 = Semester("2022/2023")
        sessionList.add(sess10)
        return sessionList
    }*/
    fun getCourseData100I(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Nigerian Legal Methods I")
        courseList.add(course1)
        val sem2 = Semester("Logic and Philosophical Thought I")
        courseList.add(sem2)
        val course3 = Semester("Literature I")
        courseList.add(course3)
        val course4 = Semester("Mass Communication I")
        courseList.add(course4)
        val course5 = Semester("Economics I")
        courseList.add(course5)
        val course6 = Semester("Computer Programming I")
        courseList.add(course6)
        return courseList
    }

    fun getCourseData100II(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Nigerian Legal Methods II")
        courseList.add(course1)
        val sem2 = Semester("Logic and Philosophical Thought II")
        courseList.add(sem2)
        val course3 = Semester("Literature II")
        courseList.add(course3)
        val course4 = Semester("Mass Communication II")
        courseList.add(course4)
        val course5 = Semester("Economics II")
        courseList.add(course5)
        val course6 = Semester("Computer Programming II")
        courseList.add(course6)
        return courseList
    }

    fun getCourseData200I(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Law of Contract I")
        courseList.add(course1)
        val sem2 = Semester("Constitutional Law I")
        courseList.add(sem2)
        val course3 = Semester("Law of Torts I")
        courseList.add(course3)
        val course4 = Semester("Nigerian Legal System I")
        courseList.add(course4)
        val course5 = Semester("Psychology I")
        courseList.add(course5)
        return courseList
    }

    fun getCourseData200II(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Law of Contract II")
        courseList.add(course1)
//        val sem2 = Semester("Constitutional Law II")
//        courseList.add(sem2)
        val course3 = Semester("Law of Torts II")
        courseList.add(course3)
        val course4 = Semester("Nigerian Legal System II")
        courseList.add(course4)
/*        val course5 = Semester("Psychology II")
        courseList.add(course5)*/
        return courseList
    }

    fun getCourseData300I(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Criminal Law I")
        courseList.add(course1)
        val sem2 = Semester("Commercial Law I")
        courseList.add(sem2)
        val course4 = Semester("Industrial/Labour Law I")
        courseList.add(course4)
        val course5 = Semester("Law of Banking and Insurance I")
        courseList.add(course5)
        val course6 = Semester("Law of Intellectual Property I")
        courseList.add(course6)
        return courseList
    }

    fun getCourseData300II(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Criminal Law II")
        courseList.add(course1)
        val sem2 = Semester("Commercial Law II")
        courseList.add(sem2)
        val course4 = Semester("Industrial/Labour Law II")
        courseList.add(course4)
        val course5 = Semester("Law of Banking and Insurance II")
        courseList.add(course5)
        val course6 = Semester("Law of Intellectual Property II")
        courseList.add(course6)
        return courseList
    }

    fun getCourseData400I(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Introduction to Political Science I")
        courseList.add(course1)
        val sem2 = Semester("Property/Land Law I")
        courseList.add(sem2)
        val course3 = Semester("Equity & Trusts I")
        courseList.add(course3)
        val course4 = Semester("Law of Evidence I")
        courseList.add(course4)
        val course5 = Semester("Women & Minority Rights I")
        courseList.add(course5)
        val course6 = Semester("Law of Energy & Natural Resources I")
        courseList.add(course6)
        val course7 = Semester("Administrative Law I")
        courseList.add(course7)
        val course8 = Semester("Law of Arbitration I")
        courseList.add(course8)
        val course9 = Semester("Maritime Law I")
        courseList.add(course9)

        return courseList
    }

    fun getCourseData400II(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Introduction to Political Science II")
        courseList.add(course1)
        val sem2 = Semester("Property/Land Law II")
        courseList.add(sem2)
        val course3 = Semester("Equity & Trusts II")
        courseList.add(course3)
        val course4 = Semester("Law of Evidence II")
        courseList.add(course4)
        val course5 = Semester("Women & Minority Rights II")
        courseList.add(course5)
        val course6 = Semester("Law of Energy & Natural Resources II")
        courseList.add(course6)
        val course7 = Semester("Administrative Law II")
        courseList.add(course7)
        val course8 = Semester("Law of Arbitration II")
        courseList.add(course8)
        val course9 = Semester("Maritime Law II")
        courseList.add(course9)
        return courseList
    }

    fun getCourseData500I(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Jurisprudence & Legal Theory I")
        courseList.add(course1)
        val sem2 = Semester("Company Law I")
        courseList.add(sem2)
        val course3 = Semester("Clinical Legal Education I")
        courseList.add(course3)
        val course4 = Semester("Environmental & Planning Law I")
        courseList.add(course4)
        val course5 = Semester("Conveyancing Law I")
        courseList.add(course5)
        val course6 = Semester("Public International Law I")
        courseList.add(course6)
        val course7 = Semester("Introduction to Advocacy I")
        courseList.add(course7)
        val course8 = Semester("Family Law I")
        courseList.add(course8)
        val course9 = Semester("Law of Taxation I")
        courseList.add(course9)
        return courseList
    }

    fun getCourseData500II(): ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Jurisprudence & Legal Theory I")
        courseList.add(course1)
        val sem2 = Semester("Company Law I")
        courseList.add(sem2)
        val course3 = Semester("Clinical Legal Education I")
        courseList.add(course3)
        val course4 = Semester("Environmental & Planning Law I")
        courseList.add(course4)
        val course5 = Semester("Conveyancing Law I")
        courseList.add(course5)
        val course6 = Semester("Public International Law I")
        courseList.add(course6)
        val course7 = Semester("Introduction to Advocacy I")
        courseList.add(course7)
        val course8 = Semester("Family Law I")
        courseList.add(course8)
        val course9 = Semester("Law of Taxation I")
        courseList.add(course9)
        return courseList
    }

    fun getQuestionsPsychoI(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Psychology", "2021/2022", "First Semester", "1a. Briefly define Forensic Psychology, \n" +
                    "b. What are the duties of a Forensic Psychologist, as it relates to Psychology and Law?\n" +
                    "c. Differentiate between a psychologist and psychiatrist\n" +
                    "\n2.Psychology as the study of I unconscious processes; following this view, mention and discuss the technique which was adopted by Sigmund Freud to treat patients with medically unexplainable symptoms.\n" +
                    "b. Define personality and explain its structures as were propounded by Freud.\n" +
                    "\n3. People who do not consider their actions whether injurious to self or others can be said to be guided by the id' principles. Use the cases of yahoo boys (internet fraudsters) to further justify this claim.\n" +
                    "b. Briefly explain drive reduction theory?\n" +
                    "\n4. In expression of emotions in man and animals, Charles Darwin argued that all people express certain basic feelings in the same ways. Enumerate and briefly comment on the basic feelings as it affects people of all races.\n" +
                    "b. With aid of a good diagram, describe Maslow's hierarchy of Needs as a Social Motive Theory\n" +
                    "\n5. What part of the brain if punctured will result in the animal eating excessively or starvation?\n" +
                    "b. Write a short note on the following: (a) Anorexia Nervosa, (b) Bulimia (c) Homeostasis")
        questionsList.add(ques1)
        return questionsList
    }

    fun getQuestionsConsI(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Constitutional Law I", "2021/2022", "First Semester", "SECTION A:\n" +
                    "1. 'A complete separation of powers is neither practicable nor desirable for effective government. What the doctrine can be taken to mean is the prevention of tyranny by the conferment of too much power on anyone person or body and the check of one power by another'. In line with the above statement by a Scholar, Professor Abiola Ojo, discuss with the aid of statutory and judicial authorities, \n" +
                    "(a) Legislative and Judicial functions of the Executive (b) Judicial and Executive functions of the Legislature, and (c) The Legislative and Executive functions of the Judiciary.\n" +
                    "\n2. There are certain minimum requirements which are the main focus of the concept of Federalism, which must be in place before a nation can be said to be truly Federal. \n" +
                    "\n(a) Discuss these Features with the aid of statutory and or Judicial authorities. (b) Discuss the merits and Demerits of Federalism.\n" +
                    "\n\nSECTION B:\n" +
                    "3. Assuming that as a well-trained constitutional law student, you have been invited by the 'Association of Psychology Students (APS)' of a certain University in Nigeria to enlighten members of the Association on change of government by extra-legal / extra-constitutional means (Revolution), you are hereby required to provide the said enlightenment, using/citing relevant legal authorities (if any).\n" +
                    "\n4. With the aid of relevant legal authorities, if any, discuss the Judiciary under Military Regime in Nigeria.\n" +
                    "\n\nSECTION C:\n" +
                    "5. (a) The Constitutional development under colonial rule in Nigeria was the outcome of the agitations of the nationalists for indigenous representation and the right of Nigerians to be part of the conduct of their affairs. Discuss this, citing various Constitutional provisions made by the Colonialists to achieve this desire of Nigerians.\n" +
                    "\n(b) What are the basic contents of an Ideal Constitution?\n" +
                    "6. (a) The Mcpherson's Constitution of 1951 is adjudged to have, to a greater extent. put in place measures to increase the participation and responsibility of Nigerians in the conduct of their affairs. Discuss this, citing such measures if any put in place by the said Constitution.\n" +
                    "\n(b) What were the landmark agreements reached at the 1958 Constitutional Conference?"
        )
        questionsList.add(ques1)
        return questionsList
    }

    fun getQuestionsContractI(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Law Of Contract", "2021/2022", "First Semester", "SECTION A\n" +
                    "1. Ade, Obi and Abubakar are three Unizik students who have been nominated to participate in the national rounds of the Malala Human Rights Moot Court Competition at Abuja. They arrived Abuja on the 10th day of December 2022 with the 'Faculty of law bus' and have moved to 'The Zion Hotel' where they are to lodge. At the premises of the hotel, there are two conspicuous notices with the inscription 'VEHICLES ARE PARKED AT OWNERS RISK'. Ade, Obi and Abubakar who are so happy to have arrived Abuja safely took some photographs at the car park there and uploaded on instagram. At the reception room, they met with the receptionist who gave them some forms to fill and thereafter handed them the key to their room. Upon getting to their hotel room, Abubakar quickly ordered for three plates of rice with chicken. While taking the meal, Obi called the attention of Ade and Abubakar to a notice on the wall of the room with the inscription, 'THE HOTEL SHALL NOT BE LIABLE FOR ANY LOSS OR DAMAGE OF PROPERTY NOT SUBMITTED TO THE RECEPTIONIST FOR SAFE CUSTODY'. The trio laughed over the said notice as they continued to devour the meal. On the 12th of December when the trio woke up to prepare for the competition, they discovered that their laptops and cell phones which were plugged in to charge the previous night had been stolen. While making a report to the hotel management concerning the incident, they discovered that the 'Faculty of law bus' which they had parked at the hotel premises was also stolen. Embittered by the turn of events and the Hotel Management's indifference towards resolving the issues, they have consulted a law firm to institute legal action against the hotel.\n" +
                    "\n(a)As a member of the legal team, state the legal issue(s) which arise(s) from the above Scenario,\n" +
                    "(b)With aid of authorities, advise Ade, Obi and Abubakar on the propriety or otherwise of their proposed legal action.\n" +
                    "\n\n2. Miss Patterson is a renowned gospel artist who had been contracted by the Nigerian government to perform her hit gospel songs at the grand opening of the National Peace and Conflict Resolution Center at Abuja scheduled from 8th to 10th December 2022. As part of the terms of the said contract, she is scheduled to participate in a one week rehearsal with the organizers of the event prior to the main event. Miss Patterson suddenly took ill on the 30th of November 2022 and was hospitalized; she was only able to meet up on the 3rd day of December 2022, that is 2 days after the rehearsals had commenced. She discovered that the Organizers of the event had already terminated her contract and found a substitute in the person of Miss Robinson who is an upcoming gospel artist.\n" +
                    "\na. Miss Patterson believes she has been unjustly treated and has sought for legal advice from you. Kindly give your legal opinion on the above issue while advising Miss Patterson on the likelihood of having a successful action.\n" +
                    "\nb. Would your answer to (a) above still be the same if Miss Patterson had missed out on the whole one week of the rehearsals and 2 days out of the 3 days of the main performance. Advise her if this second scenario was the case.\n" +
                    "\n" +
                    "3. It is trite that consideration must move from the promisee. It is based on this principle that only a party who nas furnished consideration in a contract can bring an action to enforce a promise given by the other party. Therefore, a party who has furnished no consideration in a contract cannot bring an action to enforce the said contract.\"\n" +
                    "\na) With the aid of case laws, succinctly discuss ANY TWO of the various forms on the, absence of consideration on the part of the promisee. \n" +
                    "\nb) Briefly discuss ANY TWO of the following:\n" +
                    "(i) Past Consideration (ii) Adequacy of Consideration (iii)Sufficiency of Consideration (iv) Executory Consideration (v) Executed consideration\n" +
                    "\n" +
                    "\nSECTION B\n" +
                    "\n" +
                    "4a. Miss Gladys operates a self serving shop at T junction Awka. All goods in the shop have price tags. Omo Johnson one morning entered the said shop, picked the shopping basket and loaded it with some items and approached Miss Gladys, the Sales Clerk who was checking the goods, but before she could complete the check, Omo Johnson told Miss Gladys that he has changed his mind and does not want to buy the items any more. Miss Gladys ran to the door of the shop and locked same insisting that Omo Johnson must pay for the items as there is already a binding contract between them. Miss Gladys has ran to you insisting that a legal action be taken against Omo Johnson for breach of contract. With the aid of authorities, advise Miss Gladys on the legal issues raised above (if any) and the likelihood or otherwise of the success or failure of her case.\n" +
                    "\nb. Briefly write on: What the position of the law is where the method of acceptance of an offer is not prescribed.\n" +
                    "\n" +
                    "5a. Several justifications have been advanced for the preference of the Rule in the case of Adam v. Lindsell (1818) 1 B&A 681. Succinctly discuss these justifications.\n" +
                    "\nb. Write note on Acceptance of Tenders.\n" +
                    "\n" +
                    "6a. Revocation of a unilateral contract raises peculiar problems and various schools of thought have proposed different solutions. Discuss the four basic solutions proposed by text writers.\n" +
                    "\nb. Discuss the exceptions, if any, to the Rule in the case of Adams v. Lindsell (1818) 1 B&A 681"
        )
        questionsList.add(ques1)
        return questionsList
    }
    fun getQuestionsContractII(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Law Of Contract", "2021/2022", "Second Semester", "SECTION A\n" +
                    "\n1. Chief Ade is desirous of empowering young Nigerian artists. He occasionally conducts art exhibitions to raise fund to support these start-ups. During such exhibitions, people present artworks made by the local artists as well as internationally renowned artists which artworks are auctioned. The artists by themselves sell off these artworks to Chief Ade prior to the date for exhibition. He fixed this year's exhibition for 10th February 2023. Fineboy Smart, (a scammer) on the 5th day of February 2023 dressed gentlemanly and meets with Chief Ade at the latter's office. Fineboy Smart presents himself as the internationally acclaimed Italian artist, Leonard De Vinci and offers a portrait of Monalisa which unknown to Chief Ade is an imitation of the original. They negotiate for a price and finally settle for N20,000,000. Before making payment, Chief Ade asks Fineboy to present proof of his identity. Fineboy presents an Italian cell phone number which according to him belongs to Leonard's art company (Fineboy's Company) in Italy. Chief Ade places a call across to the said numnber and confirms that the man standing before him is actually the famous artist. However, unknown to Chief Ade, the call receiver was also part of the scam. The contract between the parties was then concluded. On the exhibition day, Mr. Brown, a guest who did a PhD research on the works of Leonard Da Vinci, upon citing the said Monalisa's portrait discovers that the work is a forgery and confronts Chief Ade. Following this revelation Chief Ade became distraught as a result of mistake regarding the true identity of Fineboy.\n" +
                    "\na. With the aid of authorities advise Chief Ade on the necessary conditions he must fulfill in order to avoid the contract. What are the chances of his having a successful action?\n" +
                    "\nb. Would your answer to (a) above still be the same if Fineboy met Chief Ade (a tomato seller) in an open market and Fineboy had told Chief Ade that Fineboy was a certain popular celebrity, and for that reason got the tomatoes sold to him on credit after which Fineboy left without later paying for the tomatoes?\n" +
                    "\n\n2. In other to succeed at law in establishing misrepresentation in contract, what must a party prove?\n" +
                    "Use a sub-head for each requirement\n" +
                    "\nb. Tacit acquiesance in another's self-deception does not constitute misrepresentation. At law this is termed \"non-disclosure rule.\" Under what circumstances will this rule not apply?\n" +
                    "\n" +
                    "\n\n3.In Allcard v Skinner, the court stated that undue influence is some unfair and improper conduct, some coercion from outside, some over-reaching, some form of cheating and generally, though not always, some personal advantage obtained by the guilty party.\n" +
                    "Discuss the position of the law which an allegation of undue influence is made under the following circumstances:\n" +
                    "\na. Where there is no special relationship between the parties\n" +
                    "\nb. Where there is a special relationship between the parties\n" +
                    "\nc. How does one rebut the presumption of undue influence?\n" +
                    "\n" +
                    "SECTION B\n" +
                    "\n\n4a. Nze Okenwa is an exporter of cocoa from Nigeria to some European countries. He engaged the service of Teek Shipping company to export, 4000 tons of cocoa to the UK at the cost of L200,000. Parties agreed that, midway into the voyage, Nze Okenwa will pay half of the cost of shipment which was fixed at L100,000 whilec the balance will be paid on delivery at the port. Very close to borders of UK and after making more than half of the voyage, Teek Shipping Company was informed that it cannot enter the UK with the goods because of the new Custom Regulation passed some weeks earlier which prohibits the importation of agricultural products from Nigeria to the UK. Because of this situation, Nze Okenwa has failed to pay Teek Shipping Company the initial L100,000 that was to be paid midway through the journey. Teek Shipping Company has engaged you to take legal action to get Nze Okenwa to pay the entire amount in accordance with their agreement. Citing relevant legal authorities in support of your position. what are:\n" +
                    "\ni. The legal issue(s) raised from the facts above\n" +
                    "\nii. The applicable principle(s) of law thereof\n" +
                    "\niii. The chances of success or otherwise of the suit?\n" +
                    "\nb Write a short note on Mitigation of Damages.\n" +
                    "\n" +
                    "\n\n5. Bayo is a Civil Engincer who was engaged by Chief Ojo to construct a hostel complex near the Institute of Oceanography, Onneh at the cost of N20,000,000.\n" +
                    "Both parties agreed that Bayo shall source fund to commence the work while Chief Ojo shall pay the full sum at the completion of the complex. As the work progresses, Chief Ojo wrote Bayo informing him that he should stop work, as Chief Ojo is no more interested in the contract. Despite the formal repudiation of the contract, Bayo went on and completed the work and filed a suit to recover the contract sum from Chief Ojo.\n" +
                    "With relevant legal authorities:\n" +
                    "\ni. Discuss the legal consequences of Bayo's decision to continue and complete the complex despite Chief Ojo's action\n" +
                    "\nii. Will Bayo succeed in his suit?\n" +
                    "\niii. What are the legal consequences if Bayo (the innocent party) had treated the contract as discharged?\n" +
                    "\n\n6. Mr. Ben lives in Chief Akan's house where Ben occupies a 3 bedroom flat and pays N350,000 per annum. Both Mr. Ben and Chief Akan in a written tenancy agreement executed by them agreed that, Mr. Ben shall be paying his rent on 1st of January every year, while Chief Akan shall promptly be effecting yearly repairs of the flat. Mr. Ben has failed to pay his rents for two consecutive years thereby denying Chief Akan his right to collect rent in his flat. Because of the above, Chief Akan has decided not to affect the yearly repairs in the flat occupied by Mr. Ben despite several demands made by Mr. Ben. Mr. Ben has consulted you to institute and maintain legal action against Chief Akan, praying the court to compel Chief Akan to effect the repair that are long due for over two years.\n" +
                    "With the aid of legal authorities discuss:\n" +
                    "\ni. The legal issues in the above facts\n" +
                    "\nii. The applicable principle(s) of law to the case.\n" +
                    "\niii. Advice Mr. Ben on the chances of success of his case\n" +
                    "\nb. Write a short note on Accord and Satisfaction."
        )
        questionsList.add(ques1)
        return questionsList
    }

    fun getQuestionsLegalSysemI(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Nigerian Legal System", "2021/2022", "First Semester", "SECTION A\n" +
                    "1. Legal Systems across the world are distinguished from their characteristics. Nigeria like other countries has evolved certain characteristics which defines her Legal System. State clearly thirteen (13) of those distinguishing characteristics.\n" +
                    "\nb. Discuss in detail the three most dominant and distinguishing features of the Nigerian Legal System.\n" +
                    "\n" +
                    "2. Law is defined by different schools of thought according to the perceptions of their proponents. Mention all the schools, their proponents and their propositions.\n" +
                    "\n2b. List four classes of the Nigerian law.\n" +
                    "\n" +
                    "\nSECTION B\n" +
                    "3. Ugomma Omalicha fell in love with Okongwu, their union blossomed and God blessed their union with five beautiful daughters. On the fifth of a July while travelling to Udi in Enugu State, Okonkwo was kidnapped by ruthless herdsmen and demanded five million as ransome. After paying the ransom his corpse was released to the family who were heart broken. They immediately planned for his burial. After the burial of Okongwu, the Umuada summoned Ugomma to a meeting and demanded that she must tell them the reason for refusing to shave her hair for her dead husband according to their custom. Ugomma averred that it was contrary to her Christian belief. As if that was not enough her brothers in-law, Anuife and Ekwenti laid claim to her husband's property because she did not give birth to a male child in accordance with their custom. Ugomma has Come to you for help. With the aid of statutory and judicial authorities, kindly advise her on the position of the law.\n" +
                    "\n4. With the aid of statutory and judicial authorities, critically discuss the principle of stare decisis and ancillary matters /issues.\n" +
                    "\n\nSECTION C\n" +
                    "5a. In a detailed but succinct note, not exceeding one page and with the aid of decided authorities, analyze the nature and the applicability of the Golden Rule of interpretation. \n" +
                    "\n5b. The relevance of a preamble in the making of statutes in recent times cannot be overemphasized; thus every statute must have a Preamble\". In a detailed but succinct analysis not exceeding one page, examine the propriety or otherwise of the above statement.\n" +
                    "\n5c. ln a hierarchical order, list the courts we have in Nigeria; highlighting in the process, the courts that are of co-ordinate jurisdiction.\n" +
                    "\n" +
                    "6a. In a detailed but succinct note not exceeding one page and with the aid of decided authorities, analyze the nature and applicability of the Mischief Rule of interpretation.\n" +
                    "\n6b. Identify the different stages of the legislative process; and in not more than two sentences for each, succinctly explain what happens at each stage.\n" +
                    "\n6c. State the hierarchy of laws in a military regime."
        )
        questionsList.add(ques1)
        return questionsList
    }

    fun getQuestionsTortI(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Law Of Torts", "2022/2023", "First Semester", "SECTION A\n" +
                    "1. Mr. Fabian commenced the building of his house on his land at Nibo, that he bought in the year 2005. One faithful morning, one Mr. Obinna with some group of boys invaded the land and ordered all the workers at Mr. Fabian's building site to stop work. Mr. Obinna instructed his boys to beat up the workers and drive them away from the site which they did. Mr. Fabian was alerted about the development by one of his workers and he quickly rushed to his building site to find out what the problem was. Immediately Mr. Fabian arrived at the site, Mr. Obinna and his boys also descended on him and held him for two (2) hours before releasing him. Mr. Obinna claimed that the land where Mr. Fabian was building belonged to him. That he recently bought the land from one Mr Ekeh who happened to be a well-known land speculator and grabber. On his release, Mr Obinna warned Mr. Fabian not to come to land again. Mr Fabian has approached you for legal advice. Advise him fully on the actionable areas of Tort involved in the scenario above with the aid of decided cases and authorities?\n" +
                    "\n" +
                    "2. Joshua who is a Law student of the Nnamdi Azikiwe University visited his bosom friend Chike in his Hostel. Joshua while leaving Chike's room took Chike's Mobile Phone without telling Chike. Three days later, Joshua reported the case of his missing mobile phone to the school security. The search and trace for Chike's missing mobile phone was to no avail until two weeks later when one Miss Chioma reported Joshua to the school security for failing to deliver the phone which Joshua agreed to sell to her after collecting the sum of N50,000 (fifty thousand naira only) from her. The school security accosted Joshua and seized the phone from him. It was discovered that the phone seized from Joshua matched the description of Chike's missing phone. Chike was invited by the school security and he identified the phone as his missing mobile phone.\n" +
                    "\nAs a student of Law of Torts, answer the following questions:\n" +
                    "(a) Advise Chike comprehensively on the actionable area of Tort with the aid of decided cases and authorities?\n" +
                    "(b) State three (3) remedies that may be available to Chike in tort?\n" +
                    "(c) State three (3) defences that Joshua may raise in court?\n" +
                    "(d) State three (3) differences between conversion and trespass to chattel per ser?\n" +
                    "\nSECTION B \n" +
                    "3. A dictionary meaning of negligence can  be said to be carelessness, however the locus classicus in Donoghue vs. Stevenson (1932) A.C 562 seems to be different from this; expound in clear terms what elements must be in existence before the tort of negligence can be established in our law courts. Please discuss with relevant authorities?\n" +
                    "\n" +
                    "4. a) Define Tort of Trespass?\n" +
                    "b) State and explain the essential element that distinguishes Tort of Trespass from Tort of Negligence?\n" +
                    "c) State and briefly discuss the types or forms of Tort of Trespass?\n" +
                    "\n" +
                    "5. a) Define Malicious Prosecution.\n" +
                    "b) State the two opposing interests of social policy which the law seeks to balance.\n" +
                    "c) State and briefly discuss the four elements of this tort with aid of decided cases."
        )
        questionsList.add(ques1)
        return questionsList
    }

    fun getQuestionsTortII(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Law Of Torts", "2022/2023", "Second Semester", "SECTION A\n" +
                    "\n1. SAMPSON & CO LTD is an indigenous Nigerian beverage manufacturing company with many registered brands of products. Sometime in January 2023, a Sales Representative of the company discovered that a fake brand of the Company's 'Mixed Yugo Drink' had flooded the Onitsha Relief Market. The company on receipt of the report from the sales representative carried out a cursory market investigation and it was discovered that MR. THOMPSON a former production manager of the company who was sacked in July 2022 for misappropriation of company's fund was the person supplying the fake 'Mixed Yugo Drink' to the traders. The company later involved the Police which on further investigation and search discovered that MR. THOMPSON had converted part of his House in Obosi into a mini fake beverage manufacturing plant. It was discovered that MR. THOMPSON had few months before his sack from the company started the production and sale of fake SAMPSON & CO LTD brand of 'Mixed Yugo Drink'; no wonder the several negative complaints about the company's 'Mixed Yugo Drink' and the sharp decline in sales of the product in recent times.\n" +
                    "The managing director of SAMPSON & CO LTD has approached you, with the aid of decided cases and authorities advise him fully on the area(s) of Tort involved?\n" +
                    "\n\n2. In Nigeria, Scholars have for decades involved in discussion as to whether the Federal High Court has exclusive jurisdiction to hear passing off actions or whether the State High Courts and the Federal High Court have concurrent jurisdiction in passing off matters? Discuss.\n" +
                    "\n" +
                    "\n\n3. Answer the following questions:\n" +
                    "\n(a) What is the meaning of Tort of Deceit?\n" +
                    "\n(b) State the essential elements of Tort of Deceit?\n" +
                    "\n(c) With the aid of authorities and decided cases do a short brief on four (4) essential elements of Tort of Deceit?\n" +
                    "\n(d) State three (3) remedies and three (3) defences to Tort of Deceit.?\n" +
                    "\n" +
                    "\n\nSECTION B\n" +
                    "\n\n4. Mr. Oche a notorious herbalist had a poisonous tree on his land though its branches never extended over the boundary . Mr. Udo his boundary neighbour owns a high priced horse which brings him immense fund. Both neighbors have been co-existing peacefully until Mr. Udo's horse on one fateful day reached over the boundary and ate the leaf from the poisonous tree in\n" +
                    "Mr Oche's compound and died. Mr Udo sued Mr. Oche for damages. With the aid of statutory authorities and or decided cases, advice Mr. Oche on his rights and possible defences to this Tort.\n" +
                    "\n\n5. The driver of a petrol tanker and his fellow employees were delivering petrol into an underground tank in a filling station in Yenagoa. The driver lit a cigarette and threw away the match stick which resulted in a great damage by fire. The owners of the filling station sued the employers of the driver for damages occasioned by them. Advice the parties.\n" +
                    "\n" +
                    "\n6. John and James both own an acre of land each at the farming zone in Anambra West L.G.A. of the state. John cultivates rice and also constructed a mini irrigation dam to supply water to his rice farm. In mid-July after James just concluded the molding of 20,000 six inch solid blocks for his new site, As a result of heavy torrential rain falls that night, the dam got overflowed and ruined most of the blocks in James's site. James vows that John must pay for all the ruined blocks.\n" +
                    "You have been approached by John for legal advice-\n" +
                    "\ni. What are his possible defenses, if he is sued by James for nuisance?\n" +
                    "\nii. Had the town planning authorities marked John's fencing for demolition, and actually demolished the fence causing the over flooding of James's property, are there any possible defenses available to the authorities should they be sued by James, for their actions constituting nuisance to his property.\n" +
                    "\niii. What if the town planning authorities marked John's fence for demolition and James foreseeing the potential danger that the demolition will cause to his blocks, approaches you for legal advice, what possible legal remedies would be available to him?\n" +
                    "\n\n7. 'A' and 'B' are long time buddies and are in the same line of trade of \"cotton manufacturing\". The market requires the texture and colour of the cotton to be fluffy and snow white in order to meet international best standards. For some time \"B\" is struggling to meet the required standard thereby causing a diversion of most of his would be clients to A\", whose production outlet and showroom is adjacent to \"B's\" facility. \"B\" scorns with envy and in order to cast aspersions on \"A's\" work, purchases adulterated diesel to power his alternate power source. The fumes from the diesel is channeled towards the location where \"A'\" sundries his processed cotton causing serious damage and stain. \"B\" feigns ignorance and allows this to continue, he is also heard saying that after all he is not the manufacturer of the adulterated diesel and shouldn't be blamed for \"A's\" current misfortunes.\n" +
                    "\"A\" has approached you for legal advice:\n" +
                    "\ni. Do this stating the relevant Tort(s) and his chances of success.\n" +
                    "\nii. What are the relevant factors you think will guide the court I reaching a decision?\n" +
                    "\niii. What are the differences between physical damage and sensible material damage?"
        )
        questionsList.add(ques1)
        return questionsList
    }

    fun getQuestionsLabourI(): ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat(
            "Labour Law", "2022/2023", "First Semester", "SECTION A\n" +
                    "No 1\n" +
                    "a.The Labour Act of Nigeria makes provisions regulating the practice of apprenticeship in Nigeria. These provisions are defcient on several observable grounds. Discuss them highlighting the positions in Ghana and South Africa.\n" +
                    "b.Discuss briefly the prerogative remedies.\n" +
                    "No. 2\n" +
                    "a. Discuss the ratio decidendi in Chukwumah v Shell (1993) 4 N.W.L.R ( Pt289)12\n" +
                    "b. Discuss briefly remedies of injunction and recission\n" +
                    "c. List the International Standards on contracts of apprenticeship.\n" +
                    "\n" +
                    "SECTION B\n" +
                    "1. It is a known fact that once parties to a contract of employment expressly agree on any particular terms and conditions, they are bound by them and are so bound until they mutually agree to vary them. It also a fact that once fully entered into, the contract of employment is enforceable and ought to be treated with sanctity as to what the parties intended and that if any question arises in that respect, it is the contract document itself that must be interpreted to decide the question.\n" +
                    "a.With the aid of statutory authorities and case law (if any) discuss the veracity of the facts stated above.\n" +
                    "b. It is also a fact that there are terms which the parties may not have agreed upon but which still form part of the terms expressed in a contract of employiment. List and explain (3) three of such other terms that you know.\n" +
                    "2. The duty of an employer not to provide work is not devoid of any exceptions and thus depends on the nature of the employment and so could amount to a breach of the contract of employment. With the aid of case law, critically discuss the above and any (3) three other duties of the employer under common law.\n" +
                    "SECTION C\n" +
                    "1. A contract of employment, like all other contracts, is governed by the general law of contract. Therefore, all the essential features which characterize ordinary contracts must be present in a contract of employment before it can be said to be a valid contract of service. With the use of case Law and statutory provisions, discuss the basic element of the formation of a contract of Employment.\n" +
                    "2. The premise for the determination of the nature of a contract of employment could be determined by establishing the particular type of employment contract entered into by the parties. It is essential to argue that the protection offered by the Labour Act is only for those under a contract of service commonly referred to as “employees” and not those under a contract for services often described as “independent contractors or self-employed persons.” Over the years several tests have been propounded by jurists and legal scholars for the purpose of determining the nature of contract of employment entered into by the parties. With the aid of decided cases elucidate on these tests."
        )
        questionsList.add(ques1)
        return questionsList
    }
}