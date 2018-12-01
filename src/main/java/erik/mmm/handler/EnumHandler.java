package erik.mmm.handler;

public class EnumHandler {

	public enum EnumChips {
		BASIC(0, "basic"),
		ADVANCED(1, "advanced")
		;
		
		private int id;
		private String name;
		
		private EnumChips(int id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		
	}
	
}
