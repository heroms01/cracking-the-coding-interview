import java.util.ArrayList;

class SetOfStacks {
    //스택리스트
    ArrayList<ArrayList<Integer>> stackList = new ArrayList();

    //스택 용량
    int capacity = 2;

    public void push(Integer value) {
        // 스택리스트가 비었거나 스택 용량 가득 찼다면 새로운 스택 생성
        if (stackList.isEmpty() || ((ArrayList<Integer>)getLastArrayListObject(stackList)).size() >= capacity)
            stackList.add(new ArrayList());

        ((ArrayList<Integer>)getLastArrayListObject(stackList)).add(value);
    }

    public Integer pop() {
        if (stackList.isEmpty()) {
            return null;
        }

        //가장 최근 스택 가져오기
        ArrayList<Integer> stack = (ArrayList<Integer>)getLastArrayListObject(stackList);


        //마지막 값 가져오기
        Integer value = (Integer)getLastArrayListObject(stack);

        //마지막 데이터 삭제
        stack.remove(stack.size() - 1);

        //현재 스택 비웠으면 스택 컬렉션에서 삭제
        if (stack.isEmpty())
            stackList.remove(stackList.size()-1);

        return value;
    }

    //리스트의 마지막 데이터 가져오기
    private Object getLastArrayListObject(ArrayList arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    public static void main(String[] args) {
        SetOfStacks setOfStacks = new SetOfStacks();
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);

        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
    }
}