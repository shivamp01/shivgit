@FunctionalInterface
public interface Event {
	void doSomething();
}

class EventImpl implements Event{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("First task");
	}
	
	static class InnerEventImpl implements Event{

		@Override
		public void doSomething() {
			System.out.println("Second task");
			
		}
		
	}
	public void oneMoreImpl() {
		
		class NestedEventImpl implements Event{

			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("third task");
			}
			
		}
		new NestedEventImpl().doSomething();
	}
	public void oneLastImpl() {
		Event e=new Event() {		//Annonymous inner class
			
			@Override
			public void doSomething() {
				// TODO Auto-generated method stub
				System.out.println("fourth task");
			}
		};
		e.doSomething();
	}
	public void pakkaLastImpl() {
		Event e=() ->System.out.println("fifth task");		//Lambda expression
		e.doSomething();
	}
	
	
	public static void main(String[] args) {
		EventImpl ei=new EventImpl();
		ei.doSomething();
		//InnerEventImpl ie1=ei.new InnerEventImpl();    for non static inner class
		EventImpl.InnerEventImpl ie1=new EventImpl.InnerEventImpl();//for static class
		ie1.doSomething();
		ei.oneMoreImpl();
		ei.oneLastImpl();
		ei.pakkaLastImpl();
	}
}