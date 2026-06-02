package pkg; 
public class program6 { 
    public static void main(String[] args) { 
        // Creating StringBuffer object 
        StringBuffer sb = new StringBuffer("Java"); 
        System.out.println("Original StringBuffer: " + sb); 
 
        // Default capacity 
        System.out.println("Initial Capacity: " + sb.capacity()); 
 
        // append() 
        sb.append(" Programming"); 
        System.out.println("After append(): " + sb); 
 
        // insert() 
        sb.insert(5, "Core "); 
        System.out.println("After insert(): " + sb); 
 
        // replace() 
        sb.replace(5, 9, "Advanced "); 
        System.out.println("After replace(): " + sb); 
 
        // delete() 
        sb.delete(5, 14); 
        System.out.println("After delete(): " + sb); 
 
        // deleteCharAt() 
        sb.deleteCharAt(4); 
        System.out.println("After deleteCharAt(): " + sb); 
 
        // reverse() 
        sb.reverse(); 
        System.out.println("After reverse(): " + sb); 
 
        // length() 
        System.out.println("Length: " + sb.length()); 
 
        // charAt() 
        System.out.println("Character at index 2: " + sb.charAt(2)); 
 
        // setCharAt() 
        sb.setCharAt(2, 'X'); 
        System.out.println("After setCharAt(): " + sb); 
 
        // ensureCapacity() 
        sb.ensureCapacity(50); 
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity()); 
 
        // trimToSize() 
        sb.trimToSize(); 
        System.out.println("Capacity after trimToSize(): " + sb.capacity()); 
    } 
} 
