package HW7;

interface MusicCreator { public Number play(); }
abstract class StringInstrument { public Long play() {return 3L;} }

public class Q48 extends StringInstrument implements MusicCreator {
	public Long play() {return (long) 12;} // baz� derleyicilerde cast yap�lmad���ndada �al��maktad�r.
}
