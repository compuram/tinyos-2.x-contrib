
/**
 * @author David Moss
 */
 
configuration HplCC2500PinsC {

  provides interface GeneralIO as Power;
  provides interface GeneralIO as Csn;
  provides interface GeneralIO as Gdo0_io;
  provides interface GeneralIO as Gdo2_io;
  
  provides interface GpioInterrupt as Gdo2_int;
  provides interface GpioInterrupt as Gdo0_int;
  
}

implementation {
  
  components HplMsp430InterruptP;
  components new Msp430InterruptC() as CC2500GDO0;
  components new Msp430InterruptC() as CC2500GDO2;
  CC2500GDO2.HplInterrupt -> HplMsp430InterruptP.Port14;
  CC2500GDO0.HplInterrupt -> HplMsp430InterruptP.Port13;
  Gdo2_int = CC2500GDO2;
  Gdo0_int = CC2500GDO0;
  
  components HplCC2500PinsP;
  HplCC2500PinsP.Gdo2_int -> CC2500GDO2;
  HplCC2500PinsP.Gdo0_int -> CC2500GDO0;
  
  components HplMsp430GeneralIOC as GeneralIOC;
  components new Msp430GpioC() as CSNM;
  CSNM -> GeneralIOC.Port57;
  Csn = CSNM;
  HplCC2500PinsP.CSn -> CSNM;
  
  components new Msp430GpioC() as CC2500GDO0_IO;
  CC2500GDO0_IO -> GeneralIOC.Port13;
  Gdo0_io = CC2500GDO0_IO;
  
  components new Msp430GpioC() as CC2500GDO2_IO;
  CC2500GDO2_IO -> GeneralIOC.Port14;
  Gdo2_io = CC2500GDO2_IO;
  
  components new Msp430GpioC() as power_io;
  power_io -> GeneralIOC.Port46;
  HplCC2500PinsP.PowerIn -> power_io;
  Power = HplCC2500PinsP.PowerOut;
  
  components MainC;
  MainC.SoftwareInit -> HplCC2500PinsP;
}
