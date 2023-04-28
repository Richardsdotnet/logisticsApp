package data.repository;

import logisticsApp.data.model.Package;
import logisticsApp.data.repository.PackageRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImpTest {
    private PackageRepository packageRepository;

    @BeforeEach
    public void setUp(){
        packageRepository = new PackageRepositoryImplementation();

    }
    @Test
    @DisplayName("Create new package Test")
    public void saveOnePackage_countIsOneTest(){
        Package aPackage = new Package();
        assertEquals(0, packageRepository.count());
        packageRepository.save(aPackage);
        assertEquals(1,packageRepository.count());





    }
    @Test
    @DisplayName("Generate id test")
    public void saveOnePackage_IdIsOneTest(){
    Package aPackage = new Package();
    assertEquals(0, aPackage.getId());
    Package savedPackage = packageRepository.save(aPackage);
    assertEquals(1,savedPackage.getId());
    }


    @Test
    @DisplayName("Find by id test")
    public void saveOnePackage_findPackageById_returnSavedPackageTest(){
        Package aPackage  = new Package();
        aPackage.setPayOnDelivery(true);
        packageRepository.save(aPackage);
        Package foundPackage = packageRepository.findById(1);
        assertEquals(1,foundPackage.getId());
        assertTrue(foundPackage.isPayOnDelivery());
        assertEquals(aPackage,foundPackage);


    }
    @Test
    @DisplayName("Update test")
    public void saveTwoItemsWithSameId_countIsOneTest(){
        Package aPackage = new Package();
        aPackage.setWeightInGrams(34);
        packageRepository.save(aPackage);

        Package savedPackage = packageRepository.findById(1);
        assertEquals(aPackage, savedPackage);

        Package secondPackage = new Package();
        secondPackage.setId(1);
        secondPackage.setWeightInGrams(22);
        packageRepository.save(secondPackage);
        Package foundPackage = packageRepository.findById(1);

       assertEquals(foundPackage, secondPackage);
       assertNotEquals(foundPackage, aPackage);

    }
    @Test
    @DisplayName("Delete package")
    public void saveThreeItemsAndDeleteOne(){
        Package aPackage1 = new Package();
        Package aPackage2 = new Package();
        Package aPackage3 = new Package();
        Package aPackage4 = new Package();


        packageRepository.save(aPackage1);
        packageRepository.save(aPackage2);
        packageRepository.delete(1);
        packageRepository.save(aPackage3);
        packageRepository.save(aPackage4);

    }

    }




