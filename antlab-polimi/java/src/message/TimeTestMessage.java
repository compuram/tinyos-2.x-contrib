/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'java'
 * message type.
 */

package message;

public class TimeTestMessage extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 28;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 113;

    /** Create a new java of size 28. */
    public TimeTestMessage() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new java of the given data_length. */
    public TimeTestMessage(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new java with the given data_length
     * and base offset.
     */
    public TimeTestMessage(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new java using the given byte array
     * as backing store.
     */
    public TimeTestMessage(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new java using the given byte array
     * as backing store, with the given base offset.
     */
    public TimeTestMessage(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new java using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public TimeTestMessage(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new java embedded in the given message
     * at the given base offset.
     */
    public TimeTestMessage(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new java embedded in the given message
     * at the given base offset and length.
     */
    public TimeTestMessage(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <java> \n";
      try {
        s += "  [acquire=0x"+Long.toHexString(get_acquire())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [process=0x"+Long.toHexString(get_process())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [sending=0x"+Long.toHexString(get_sending())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [send_size=0x"+Long.toHexString(get_send_size())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [id=0x"+Long.toHexString(get_id())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [acq_period=0x"+Long.toHexString(get_acq_period())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [pause_time=0x"+Long.toHexString(get_pause_time())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: acquire
    //   Field type: long, unsigned
    //   Offset (bits): 0
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'acquire' is signed (false).
     */
    public static boolean isSigned_acquire() {
        return false;
    }

    /**
     * Return whether the field 'acquire' is an array (false).
     */
    public static boolean isArray_acquire() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'acquire'
     */
    public static int offset_acquire() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'acquire'
     */
    public static int offsetBits_acquire() {
        return 0;
    }

    /**
     * Return the value (as a long) of the field 'acquire'
     */
    public long get_acquire() {
        return (long)getUIntBEElement(offsetBits_acquire(), 32);
    }

    /**
     * Set the value of the field 'acquire'
     */
    public void set_acquire(long value) {
        setUIntBEElement(offsetBits_acquire(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'acquire'
     */
    public static int size_acquire() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'acquire'
     */
    public static int sizeBits_acquire() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: process
    //   Field type: long, unsigned
    //   Offset (bits): 32
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'process' is signed (false).
     */
    public static boolean isSigned_process() {
        return false;
    }

    /**
     * Return whether the field 'process' is an array (false).
     */
    public static boolean isArray_process() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'process'
     */
    public static int offset_process() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'process'
     */
    public static int offsetBits_process() {
        return 32;
    }

    /**
     * Return the value (as a long) of the field 'process'
     */
    public long get_process() {
        return (long)getUIntBEElement(offsetBits_process(), 32);
    }

    /**
     * Set the value of the field 'process'
     */
    public void set_process(long value) {
        setUIntBEElement(offsetBits_process(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'process'
     */
    public static int size_process() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'process'
     */
    public static int sizeBits_process() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: sending
    //   Field type: long, unsigned
    //   Offset (bits): 64
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'sending' is signed (false).
     */
    public static boolean isSigned_sending() {
        return false;
    }

    /**
     * Return whether the field 'sending' is an array (false).
     */
    public static boolean isArray_sending() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'sending'
     */
    public static int offset_sending() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'sending'
     */
    public static int offsetBits_sending() {
        return 64;
    }

    /**
     * Return the value (as a long) of the field 'sending'
     */
    public long get_sending() {
        return (long)getUIntBEElement(offsetBits_sending(), 32);
    }

    /**
     * Set the value of the field 'sending'
     */
    public void set_sending(long value) {
        setUIntBEElement(offsetBits_sending(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'sending'
     */
    public static int size_sending() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'sending'
     */
    public static int sizeBits_sending() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: send_size
    //   Field type: long, unsigned
    //   Offset (bits): 96
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'send_size' is signed (false).
     */
    public static boolean isSigned_send_size() {
        return false;
    }

    /**
     * Return whether the field 'send_size' is an array (false).
     */
    public static boolean isArray_send_size() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'send_size'
     */
    public static int offset_send_size() {
        return (96 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'send_size'
     */
    public static int offsetBits_send_size() {
        return 96;
    }

    /**
     * Return the value (as a long) of the field 'send_size'
     */
    public long get_send_size() {
        return (long)getUIntBEElement(offsetBits_send_size(), 32);
    }

    /**
     * Set the value of the field 'send_size'
     */
    public void set_send_size(long value) {
        setUIntBEElement(offsetBits_send_size(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'send_size'
     */
    public static int size_send_size() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'send_size'
     */
    public static int sizeBits_send_size() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: id
    //   Field type: long, unsigned
    //   Offset (bits): 128
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'id' is signed (false).
     */
    public static boolean isSigned_id() {
        return false;
    }

    /**
     * Return whether the field 'id' is an array (false).
     */
    public static boolean isArray_id() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'id'
     */
    public static int offset_id() {
        return (128 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'id'
     */
    public static int offsetBits_id() {
        return 128;
    }

    /**
     * Return the value (as a long) of the field 'id'
     */
    public long get_id() {
        return (long)getUIntBEElement(offsetBits_id(), 32);
    }

    /**
     * Set the value of the field 'id'
     */
    public void set_id(long value) {
        setUIntBEElement(offsetBits_id(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'id'
     */
    public static int size_id() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'id'
     */
    public static int sizeBits_id() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: acq_period
    //   Field type: long, unsigned
    //   Offset (bits): 160
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'acq_period' is signed (false).
     */
    public static boolean isSigned_acq_period() {
        return false;
    }

    /**
     * Return whether the field 'acq_period' is an array (false).
     */
    public static boolean isArray_acq_period() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'acq_period'
     */
    public static int offset_acq_period() {
        return (160 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'acq_period'
     */
    public static int offsetBits_acq_period() {
        return 160;
    }

    /**
     * Return the value (as a long) of the field 'acq_period'
     */
    public long get_acq_period() {
        return (long)getUIntBEElement(offsetBits_acq_period(), 32);
    }

    /**
     * Set the value of the field 'acq_period'
     */
    public void set_acq_period(long value) {
        setUIntBEElement(offsetBits_acq_period(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'acq_period'
     */
    public static int size_acq_period() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'acq_period'
     */
    public static int sizeBits_acq_period() {
        return 32;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: pause_time
    //   Field type: long, unsigned
    //   Offset (bits): 192
    //   Size (bits): 32
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'pause_time' is signed (false).
     */
    public static boolean isSigned_pause_time() {
        return false;
    }

    /**
     * Return whether the field 'pause_time' is an array (false).
     */
    public static boolean isArray_pause_time() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'pause_time'
     */
    public static int offset_pause_time() {
        return (192 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'pause_time'
     */
    public static int offsetBits_pause_time() {
        return 192;
    }

    /**
     * Return the value (as a long) of the field 'pause_time'
     */
    public long get_pause_time() {
        return (long)getUIntBEElement(offsetBits_pause_time(), 32);
    }

    /**
     * Set the value of the field 'pause_time'
     */
    public void set_pause_time(long value) {
        setUIntBEElement(offsetBits_pause_time(), 32, value);
    }

    /**
     * Return the size, in bytes, of the field 'pause_time'
     */
    public static int size_pause_time() {
        return (32 / 8);
    }

    /**
     * Return the size, in bits, of the field 'pause_time'
     */
    public static int sizeBits_pause_time() {
        return 32;
    }

}