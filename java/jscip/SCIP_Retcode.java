/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jscip;

public final class SCIP_Retcode {
  public final static SCIP_Retcode SCIP_OKAY = new SCIP_Retcode("SCIP_OKAY", SCIPJNIJNI.SCIP_OKAY_get());
  public final static SCIP_Retcode SCIP_ERROR = new SCIP_Retcode("SCIP_ERROR", SCIPJNIJNI.SCIP_ERROR_get());
  public final static SCIP_Retcode SCIP_NOMEMORY = new SCIP_Retcode("SCIP_NOMEMORY", SCIPJNIJNI.SCIP_NOMEMORY_get());
  public final static SCIP_Retcode SCIP_READERROR = new SCIP_Retcode("SCIP_READERROR", SCIPJNIJNI.SCIP_READERROR_get());
  public final static SCIP_Retcode SCIP_WRITEERROR = new SCIP_Retcode("SCIP_WRITEERROR", SCIPJNIJNI.SCIP_WRITEERROR_get());
  public final static SCIP_Retcode SCIP_NOFILE = new SCIP_Retcode("SCIP_NOFILE", SCIPJNIJNI.SCIP_NOFILE_get());
  public final static SCIP_Retcode SCIP_FILECREATEERROR = new SCIP_Retcode("SCIP_FILECREATEERROR", SCIPJNIJNI.SCIP_FILECREATEERROR_get());
  public final static SCIP_Retcode SCIP_LPERROR = new SCIP_Retcode("SCIP_LPERROR", SCIPJNIJNI.SCIP_LPERROR_get());
  public final static SCIP_Retcode SCIP_NOPROBLEM = new SCIP_Retcode("SCIP_NOPROBLEM", SCIPJNIJNI.SCIP_NOPROBLEM_get());
  public final static SCIP_Retcode SCIP_INVALIDCALL = new SCIP_Retcode("SCIP_INVALIDCALL", SCIPJNIJNI.SCIP_INVALIDCALL_get());
  public final static SCIP_Retcode SCIP_INVALIDDATA = new SCIP_Retcode("SCIP_INVALIDDATA", SCIPJNIJNI.SCIP_INVALIDDATA_get());
  public final static SCIP_Retcode SCIP_INVALIDRESULT = new SCIP_Retcode("SCIP_INVALIDRESULT", SCIPJNIJNI.SCIP_INVALIDRESULT_get());
  public final static SCIP_Retcode SCIP_PLUGINNOTFOUND = new SCIP_Retcode("SCIP_PLUGINNOTFOUND", SCIPJNIJNI.SCIP_PLUGINNOTFOUND_get());
  public final static SCIP_Retcode SCIP_PARAMETERUNKNOWN = new SCIP_Retcode("SCIP_PARAMETERUNKNOWN", SCIPJNIJNI.SCIP_PARAMETERUNKNOWN_get());
  public final static SCIP_Retcode SCIP_PARAMETERWRONGTYPE = new SCIP_Retcode("SCIP_PARAMETERWRONGTYPE", SCIPJNIJNI.SCIP_PARAMETERWRONGTYPE_get());
  public final static SCIP_Retcode SCIP_PARAMETERWRONGVAL = new SCIP_Retcode("SCIP_PARAMETERWRONGVAL", SCIPJNIJNI.SCIP_PARAMETERWRONGVAL_get());
  public final static SCIP_Retcode SCIP_KEYALREADYEXISTING = new SCIP_Retcode("SCIP_KEYALREADYEXISTING", SCIPJNIJNI.SCIP_KEYALREADYEXISTING_get());
  public final static SCIP_Retcode SCIP_MAXDEPTHLEVEL = new SCIP_Retcode("SCIP_MAXDEPTHLEVEL", SCIPJNIJNI.SCIP_MAXDEPTHLEVEL_get());
  public final static SCIP_Retcode SCIP_BRANCHERROR = new SCIP_Retcode("SCIP_BRANCHERROR", SCIPJNIJNI.SCIP_BRANCHERROR_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SCIP_Retcode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SCIP_Retcode.class + " with value " + swigValue);
  }

  private SCIP_Retcode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SCIP_Retcode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private SCIP_Retcode(String swigName, SCIP_Retcode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static SCIP_Retcode[] swigValues = { SCIP_OKAY, SCIP_ERROR, SCIP_NOMEMORY, SCIP_READERROR, SCIP_WRITEERROR, SCIP_NOFILE, SCIP_FILECREATEERROR, SCIP_LPERROR, SCIP_NOPROBLEM, SCIP_INVALIDCALL, SCIP_INVALIDDATA, SCIP_INVALIDRESULT, SCIP_PLUGINNOTFOUND, SCIP_PARAMETERUNKNOWN, SCIP_PARAMETERWRONGTYPE, SCIP_PARAMETERWRONGVAL, SCIP_KEYALREADYEXISTING, SCIP_MAXDEPTHLEVEL, SCIP_BRANCHERROR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

