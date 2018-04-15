package com.example.jkuat;

import com.example.jkuat.Entities.units;
import com.example.jkuat.Repository.UnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JkuatApplication implements CommandLineRunner{

    //inject the repository
	@Autowired
	public UnitsRepository unitsRepository;

	public static void main(String[] args) {
		SpringApplication.run(JkuatApplication.class, args);
	}
	//seed the H2 database
	@Override
	public void run( String [] args) throws Exception {
        unitsRepository.save( new units( "Computer Hardware and Organization", "BIT 2102", "1st", "1.1", " equips students with basic computer component knowledge  " ) );
        unitsRepository.save( new units( " Networking Essentials", "BIT 2205", "1st", "1.1", "equips the  student with basic netwoking skills,data communication" ) );
        unitsRepository.save( new units( "  Introduction to Computers and Operating Systems", "BCT 2101", "1st", "1.1", " the student will learn classification of computers, generation, characteristics" ) );
        unitsRepository.save( new units( " Software Applications-I ", "BCT 2102", "1st", "1.1", " equips the student with word processer knowledge" ) );
        unitsRepository.save( new units( " Software Applications-II ", "BCT 2103", "1st", "1.1", "the students will aquire knowledge to use microsoft access database" ) );
        unitsRepository.save( new units( " Principles of Programming Languages ", "BCT 2104", "1st", "1.1", "this course equips the student with programming structure knowledge" ) );
        unitsRepository.save( new units( " Accounting Software ", "BCT 2105", "1st", "1.1", "equips students with knowledge of financial accounting using softwares like sage, quickbooks" ) );
        unitsRepository.save( new units( " Internet ", "BCT 2106", "1st", "1.1", "equips students with skills of internet and worlwide web " ) );
        unitsRepository.save( new units( " Introduction to Programming ", "BIT 3204", "1st", "1.2", "THE BASICS OF COMPUTER PROGRAMMING " ) );
        unitsRepository.save( new units( " Operating Systems I ", "BIT 2106", "1st", "1.2", "Equips the student with knowledge of os like multiprogramming" ) );
        unitsRepository.save( new units( " Object Oriented Programming I ", "BIT 2109", "1st", "1.2", "Equips the student with knowledge in structural and objectoriented languages using visual basic  " ) );
        unitsRepository.save( new units( " Network System Design and Implementation ", "BIT 2116", "1st", "1.2", " Equips the student with knowledge in network topologies and how the computer communicates via the internet" ) );
        unitsRepository.save( new units( " Computing and Communication Skills ", "BCT 2106", "1st", "1.2", "Equips the student with knowledge in elements, process,purpose and qualities and barriers of communication" ) );
        unitsRepository.save( new units( " Principles of Electrical Engineering. ", "BCT 2202", "1st", "1.2", "Equips the student with knowledge in electronic components eg components in the mottherboard eg transistors" ) );
        unitsRepository.save( new units( " principles of Computer Maintenanc ", "BCT 2203", "1st", "1.2", "Equips the student with knowledgein computer repairs, installation and troubleshooting" ) );
    }
}
