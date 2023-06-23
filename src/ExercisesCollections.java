import java.util.*;

public class ExercisesCollections {
    public static void main(String[] args) {

        sumOfInteger(new int[]{1,2,3,4,5});
        hashSetFromArrayList(new ArrayList<String>(List.of("x","y","z")));
        maxFromArraylist(new ArrayList<Integer>(List.of(1,22,3,4,5)));

        LinkedList<String> arr1 = new LinkedList<String>(List.of("a","b","c"));
        reverse(arr1);


        Map<String, Integer> studentMap = new HashMap<>();
        //Add elements to the HashMap
        studentMap.put("Alice", 10);
        studentMap.put("Bob", 9);
        studentMap.put("Charlie", 7);
        studentMap.put("David", 8);

        hashMapNameAndScore(studentMap);


        checkArrayListContainsSpecificValue();

        sortArrayListByAlphabet();

        ArrayList<Integer> arrListToTree = new ArrayList<Integer>(List.of(2,1,3,5,4));
        treeSetFromArrayList(arrListToTree);

        //Ex9
        ArrayList<Object> a = new ArrayList<>();
        a.add(20);
        a.add("Elu");
        HashSet<Object> b = new HashSet<>();
        b.add(10000);
        addArrayListToHashSet(a, b);

        //Ex10
        ArrayList<Object> ex10 = new ArrayList<>();
        ex10.add(10);
        ex10.add(20);
        ex10.add(20);
        ex10.add(20);
        ex10.add(20);
        removeDuplicateFromArraylist(ex10);

        //Ex11
        ArrayList<Object> ex11 = new ArrayList<>();
        ex11.add(10);
        ex11.add(20);
        ex11.add("Green");
        ex11.add("White");
        cloneArraylist(ex11);

        //ex12
        String p = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: " +
                "a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. " +
                "In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. " +
                "A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116). " +
                "Length and appearance do not determine whether a section in a paper is a paragraph.";
        TreeMap<String, Integer> map = new TreeMap<>();
        countingCharacters(p, map);


        //Ex13
        elementNumberOfAppearanceInLinkedList();

        //Ex14
        //Create an ArrayList to store intgers
        List<Object> ex14 = new ArrayList<>();

        //Add elements to the ArrayList
//        ex14.add(10);
//        ex14.add(20);
//        ex14.add("haha");
        checkEmpty(ex14);


        //Ex15
        List<Object> ex15 = new ArrayList<>();
        ex15.add(10);
        ex15.add(20);
        ex15.add("haha");
        insertToArraylistAtSpecificIndex(ex15,2);

        //Ex16
        List<Integer> ex16 = new ArrayList<>();
        ex16.add(4);
        ex16.add(2);
        ex16.add(1);
       ex16.add(3);
        ex16.add(2);
//        ex16.add(5);
        priorityQueueOfArrayList(ex16);

        //Ex17
        List<Integer> ex17 = new ArrayList<>(List.of(10, 20));
        List<Integer> ex17check = new ArrayList<>(List.of(10,20,30,40));
        checkArrayListContainAllElementOtherInList(ex17,ex17check);

        //Ex18
        LinkedList<Integer> ex18 = new LinkedList<>();
        ex18.add(1);
        ex18.add(2);
        ex18.add(3);
        ex18.add(4);
        sortDescending(ex18);

        //Ex19
        List<String> ex19 = new ArrayList<>(List.of("aaaa", "bbbb"));

        createHashSetFromArrayList(ex19);

        //Ex20
        List<Object> ex20 = new ArrayList<>();
        ex20.add("aaaaa");
        ex20.add("10");
        ex20.add("20");
        ex20.add("royal");
        ex20.add("30");
        getFirstAndLastOfArrList(ex20);


    }

    public static void migrate(List<String> left, List<String> right) {
        ArrayList<String> leftToRight = new ArrayList<String>();
        leftToRight.addAll(right);
        leftToRight.addAll(left);
        for(String element : leftToRight){
            System.out.print(element+ "  ");
        }

    }

    public static void transform(List<String> arr){
        System.out.println("Array List before transform: " + arr);

        for(int i=0; i<arr.size(); i++){
            arr.set(i, String.valueOf(i));
        }

        System.out.println("Array List after transform: " + arr);
    }

    public static void sumOfInteger(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void hashSetFromArrayList(ArrayList<String> arr){
        Set<String> set = new HashSet<String>(arr);
        System.out.println(set);
    }

    public static void reverse(LinkedList<String> arr)  {
        Iterator<String> reverseArr = arr.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (reverseArr.hasNext()) {
            System.out.print(reverseArr.next()+" ");
        }
        System.out.println();
        System.out.println();

    }

    public static void maxFromArraylist(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        System.out.println(max);
    }

    public static void hashMapNameAndScore(Map<String,Integer> map){
        System.out.println("\nEx5");
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " with score: " + entry.getValue());
        }
    }

    public static void checkArrayListContainsSpecificValue(){
        //Create an ArrayList to store intgers
        List<Integer> numbers = new ArrayList<>();

        //Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //Check if the ArrayList contains a specific number
        boolean contains = numbers.contains(Integer.valueOf(20));
        System.out.println();
        System.out.println("Ex6");
        System.out.println("Contains 20? "+ contains);
    }


    public static void sortArrayListByAlphabet(){
        List<String> listString = new ArrayList<>(List.of("x","z","y","c","a","b"));
        Collections.sort(listString);
        System.out.println("\nEx7 ");
        System.out.println("Sorted by alphabet: "+listString);
    }

    public static void treeSetFromArrayList(ArrayList<Integer> arrayList){
        TreeSet<Object> treeSet = new TreeSet<>(arrayList);
        treeSet.add(45);
        treeSet.add(15);
        treeSet.add(99);
        treeSet.add(70);
        treeSet.add(65);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(60);
        treeSet.add(80);

        //TreeSet elements is sorted ascending
        System.out.println("\nEx8 ");
        System.out.println("TreeSet : "+treeSet);
    }

    public static void addArrayListToHashSet(ArrayList<Object> arrayList, HashSet<Object> hashSet){

        hashSet.addAll(arrayList);
        System.out.println("\nEx9 ");
        System.out.println("HashSet after adding arraylist " +arrayList+ " is : "+hashSet);
    }

    public static void removeDuplicateFromArraylist(ArrayList<Object> arr){
        HashSet<Object> hashSet = new HashSet<>(arr);
        ArrayList<Object> newArr = new ArrayList<>(hashSet);
        System.out.println("\nEx10 ");
        System.out.println("Arraylist "+arr+"  after removing duplicate elements is : "+newArr);
    }

    public static void cloneArraylist(ArrayList<Object> arr){
        System.out.println("\nEx11 ");
        System.out.println("Original array list: " + arr);
        ArrayList<String> clone = (ArrayList<String>)arr.clone();
        System.out.println("Cloned array list: " + clone);
    }

    public static TreeMap<String, Integer> countingCharacters(String p , TreeMap<String,Integer> map){
        p = p.replaceAll("\\p{P}", ""); // replace all punctuations
        p = p.toLowerCase(); // turn all words into lowercase
        String[] words = p.split(" ");
            // Collect the word count
            for (String word : words) {
                if(!map.containsKey(word)){
                    map.put(word, 1);
                } else {
                    int count = map.get(word);
                    map.put(word, count + 1);
                }
            }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        System.out.println("\nEx12 ");
        System.out.println("List of string : ");
        while(iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
//        System.out.println("Counting on string '"+ check+ "' in paragraph is: " + map.get(check));
        return map;
    }

    public static void elementNumberOfAppearanceInLinkedList(){
        //Create a LinkedList to store strings
        LinkedList<Object> names = new LinkedList<>();

        //Add elements to the linkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Charlie");
        names.add("Charlie");

        TreeMap<Object, Integer> map = new TreeMap<>();

        for(Object name: names){
            if(!map.containsKey(name)){
                map.put(name, 1);
            } else {
                int count = map.get(name);
                map.put(name, count + 1);
            }
        }
        Iterator<Map.Entry<Object, Integer>> iter = map.entrySet().iterator();
        System.out.println("\nEx13 ");
        System.out.println("List of node in linkedList : ");
        while(iter.hasNext()) {
            Map.Entry<Object, Integer> entry = iter.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void checkEmpty(List<Object> list){
        boolean empty = list.isEmpty();
        System.out.println("\nEx14");
        System.out.println("Is the ArrayList empty? "+ empty);

    }

    public static void insertToArraylistAtSpecificIndex(List<Object> list,int index){
        list.add(index, "Charlie");
        System.out.println("\nEx15");
        System.out.println("List after adding element at index "+index+" : "+list);
    }

    public static void priorityQueueOfArrayList(List<Integer> list){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(list);
        System.out.println("\nEx16");
        System.out.println("List no prior: "+list);
        System.out.println("Priority Queue of ArrayList : "+priorityQueue);
    }

    public static void checkArrayListContainAllElementOtherInList(List<Integer> arr, List<Integer> arr2) {
        System.out.println("\nEx17");
        for(Integer number : new HashSet<>(arr2))
            if (arr.contains(number))
                continue;
            else{
                System.out.println("ArrayList not contain all element of other ArrayList");
                return;
            }
        System.out.println("ArrayList contain all element of other ArrayList");
    }

    public static void sortDescending(LinkedList<Integer> llist){
        Collections.sort(llist, Collections.reverseOrder());
        System.out.println("\nEx18");
        System.out.println("Sorted descending: "+llist);
    }

    public static void createHashSetFromArrayList(List<String> list){
        HashSet<String> hashSet = new HashSet<String>(list);
        System.out.println("\nEx19");
        // creates Iterator .
        Iterator<String> itr = hashSet.iterator();

        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    public static void getFirstAndLastOfArrList(List<Object> list){
        Object first = list.get(0);
        Object last = list.get(list.size()-1);
        System.out.println("\nEx20");
        System.out.println("List: "+list);
        System.out.println("First element: "+first);
        System.out.println("Last element: "+last);
    }
}
