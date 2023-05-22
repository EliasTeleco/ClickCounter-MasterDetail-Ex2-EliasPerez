package es.ulpgc.eite.cleancode.clickcounter;


import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.uiautomator.UiDevice;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import es.ulpgc.eite.cleancode.clickcounter.master.MasterActivity;

@SuppressWarnings("deprecation")
@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClickCounterInstrTests { // 18 tests


    @Rule
    public ActivityTestRule<MasterActivity> rule =
        new ActivityTestRule<>(MasterActivity.class);

    private ClickCounterRobot robot = new ClickCounterRobot();



    private void rotateScreen() {

        try {

            UiDevice device = UiDevice.getInstance(getInstrumentation());

            Thread.sleep(700);
            device.setOrientationLeft();
            Thread.sleep(700);
            device.setOrientationNatural();
            Thread.sleep(700);

        } catch (Exception e) {

        }

    }



    @Test
    public void test01CrearContadorEnMaestro() { // 1

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // When pulsar boton master
        robot.pulsarBotonMaster();
        // Then mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
    }

    @Test
    public void test02CrearContadorEnMaestroConRotacion() { // 2

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master
        robot.pulsarBotonMaster();
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
    }

    @Test
    public void test03PulsarEnContadorDeMaestro() { // 3

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master
        robot.pulsarBotonMaster();
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
        // When pulsar boton contador en posicion "0"
        robot.pulsarBotonContadorEnPosicionP1("0");
        // Then mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
    }

    @Test
    public void test04PulsarEnContadorDeMaestroConRotacion() { // 4

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master
        robot.pulsarBotonMaster();
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
        // And pulsar boton contador en posicion "0"
        robot.pulsarBotonContadorEnPosicionP1("0");
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
    }

    @Test
    public void test05PulsarEnContadorDeDetalle() { // 5

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master
        robot.pulsarBotonMaster();
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
        // And pulsar boton contador en posicion "0"
        robot.pulsarBotonContadorEnPosicionP1("0");
        // And mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
        // When pulsar boton detalle
        robot.pulsarBotonDetalle();
        // Then mostrar contador con valor "2"
        robot.mostrarContadorConValorP1("2");
        // And mostrar numero de clicks con valor "2"
        robot.mostrarNumeroDeClicksConValorP1("2");
    }

    @Test
    public void test06PulsarEnContadorDeDetalleConRotacion() { // 6

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master
        robot.pulsarBotonMaster();
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
        // And pulsar boton contador en posicion "0"
        robot.pulsarBotonContadorEnPosicionP1("0");
        // And mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
        // And pulsar boton detalle
        robot.pulsarBotonDetalle();
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador con valor "2"
        robot.mostrarContadorConValorP1("2");
        // And mostrar numero de clicks con valor "2"
        robot.mostrarNumeroDeClicksConValorP1("2");
    }

    @Test
    public void test07PulsarEnRegresarDeDetalle() { // 7

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master
        robot.pulsarBotonMaster();
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
        // And pulsar boton contador en posicion "0"
        robot.pulsarBotonContadorEnPosicionP1("0");
        // And mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
        // And pulsar boton detalle
        robot.pulsarBotonDetalle();
        // And mostrar contador con valor "2"
        robot.mostrarContadorConValorP1("2");
        // And mostrar numero de clicks con valor "2"
        robot.mostrarNumeroDeClicksConValorP1("2");

        // When pulsar boton regresar
        robot.pulsarBotonRegresar();
        // Then mostrar contador en lista en posicion "0" con valor "2"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
    }


    @Test
    public void test08PulsarEnRegresarDeDetalleConRotacion() { // 8

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master
        robot.pulsarBotonMaster();
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
        // And pulsar boton contador en posicion "0"
        robot.pulsarBotonContadorEnPosicionP1("0");
        // And mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
        // And pulsar boton detalle
        robot.pulsarBotonDetalle();
        // And mostrar contador con valor "2"
        robot.mostrarContadorConValorP1("2");
        // And mostrar numero de clicks con valor "2"
        robot.mostrarNumeroDeClicksConValorP1("2");
        // And pulsar boton regresar
        robot.pulsarBotonRegresar();
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador en lista en posicion "0" con valor "2"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "2");
        // And mostrar lista con numero de contadores "1"
        robot.mostrarListaConNumeroDeContadoresP1("1");
    }


    @Test
    public void test09CrearVariosContadoresEnMaestro() { // 9

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // When pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // Then mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
    }

    @Test
    public void test10CrearVariosContadoresEnMaestroConRotacion() { // 10

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
    }

    @Test
    public void test11PulsarVariasVecesEnContadorDeMaestro() { // 11

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // When pulsar boton contador en posicion "2"
        robot.pulsarBotonContadorEnPosicionP1("2");
        // Then mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
    }


    @Test
    public void test12PulsarVariasVecesEnContadorDeMaestroConRotacion() { // 12

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // And pulsar boton contador en posicion "2"
        robot.pulsarBotonContadorEnPosicionP1("2");
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "1"
        robot.mostrarNumeroDeClicksConValorP1("1");
    }

    @Test
    public void test13PulsarVariasVecesEnContadoresDeMaestro() { // 13

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // When pulsar boton contador en posicion "1" numero de veces "2"
        robot.pulsarBotonContadorEnPosicionP1NumeroDeVecesP2("1", "2");
        // And pulsar boton contador en posicion "2"
        robot.pulsarBotonContadorEnPosicionP1("2");
        // Then mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "3"
        robot.mostrarNumeroDeClicksConValorP1("3");
    }

    @Test
    public void test14PulsarVariasVecesEnContadoresDeMaestroConRotacion() { // 14

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // And pulsar boton contador en posicion "1" numero de veces "2"
        robot.pulsarBotonContadorEnPosicionP1NumeroDeVecesP2("1", "2");
        // And pulsar boton contador en posicion "2"
        robot.pulsarBotonContadorEnPosicionP1("2");
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "3"
        robot.mostrarNumeroDeClicksConValorP1("3");
    }

    @Test
    public void test15PulsarEnContadorDeDetalles() { // 15

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // And pulsar boton contador en posicion "1" numero de veces "2"
        robot.pulsarBotonContadorEnPosicionP1NumeroDeVecesP2("1", "2");
        // And mostrar contador en lista en posicion "1" con valor "2"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "2");
        // And pulsar boton contador en posicion "1"
        robot.pulsarBotonContadorEnPosicionP1("1");
        // And mostrar contador con valor "3"
        robot.mostrarContadorConValorP1("3");
        // And mostrar numero de clicks con valor "3"
        robot.mostrarNumeroDeClicksConValorP1("3");
        // When pulsar boton detalle
        robot.pulsarBotonDetalle();
        // Then mostrar contador con valor "4"
        robot.mostrarContadorConValorP1("4");
        // And mostrar numero de clicks con valor "4"
        robot.mostrarNumeroDeClicksConValorP1("4");
    }

    @Test
    public void test16PulsarEnContadorDeDetallesConRotacion() { // 16

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // And pulsar boton contador en posicion "1" numero de veces "2"
        robot.pulsarBotonContadorEnPosicionP1NumeroDeVecesP2("1", "2");
        // And mostrar contador en lista en posicion "1" con valor "2"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "2");
        // And pulsar boton contador en posicion "1"
        robot.pulsarBotonContadorEnPosicionP1("1");
        // And mostrar contador con valor "3"
        robot.mostrarContadorConValorP1("3");
        // And mostrar numero de clicks con valor "3"
        robot.mostrarNumeroDeClicksConValorP1("3");
        // And pulsar boton detalle
        robot.pulsarBotonDetalle();
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador con valor "4"
        robot.mostrarContadorConValorP1("4");
        // And mostrar numero de clicks con valor "4"
        robot.mostrarNumeroDeClicksConValorP1("4");
    }

    @Test
    public void test17PulsarVariasVecesContadorDeDetalles() { // 17

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // And pulsar boton contador en posicion "1" numero de veces "2"
        robot.pulsarBotonContadorEnPosicionP1NumeroDeVecesP2("1", "2");
        // And pulsar boton contador en posicion "2"
        robot.pulsarBotonContadorEnPosicionP1("2");
        // And mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "3"
        robot.mostrarNumeroDeClicksConValorP1("3");
        // When pulsar boton detalle numero de veces "3"
        robot.pulsarBotonDetalleNumeroDeVecesP1("3");
        // Then mostrar contador con valor "4"
        robot.mostrarContadorConValorP1("4");
        // And mostrar numero de clicks con valor "6"
        robot.mostrarNumeroDeClicksConValorP1("6");
    }

    @Test
    public void test18PulsarVariasVecesContadorDeDetallesConRotacion() { // 18

        // Given  mostrar lista con numero de contadores "0"
        robot.mostrarListaConNumeroDeContadoresP1("0");
        // And pulsar boton master numero de veces "3"
        robot.pulsarBotonMasterNumeroDeVecesP1("3");
        // And mostrar contador en lista en posicion "0" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("0", "0");
        // And mostrar contador en lista en posicion "1" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("1", "0");
        // And mostrar contador en lista en posicion "2" con valor "0"
        robot.mostrarContadorEnListaEnPosicionP1ConValorP2("2", "0");
        // And mostrar lista con numero de contadores "3"
        robot.mostrarListaConNumeroDeContadoresP1("3");
        // And pulsar boton contador en posicion "1" numero de veces "2"
        robot.pulsarBotonContadorEnPosicionP1NumeroDeVecesP2("1", "2");
        // And pulsar boton contador en posicion "2"
        robot.pulsarBotonContadorEnPosicionP1("2");
        // And mostrar contador con valor "1"
        robot.mostrarContadorConValorP1("1");
        // And mostrar numero de clicks con valor "3"
        robot.mostrarNumeroDeClicksConValorP1("3");
        // And pulsar boton detalle numero de veces "3"
        robot.pulsarBotonDetalleNumeroDeVecesP1("3");
        // When rotar pantalla
        rotateScreen();
        // Then mostrar contador con valor "4"
        robot.mostrarContadorConValorP1("4");
        // And mostrar numero de clicks con valor "6"
        robot.mostrarNumeroDeClicksConValorP1("6");
    }
}