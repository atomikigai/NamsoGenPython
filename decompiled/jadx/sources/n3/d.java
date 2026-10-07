package n3;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pc.f f7253a = new pc.f("(?:^|[\\s|(\\[])((?:\\d{1,3}\\.){3}\\d{1,3}|[A-Za-z0-9-]+(?:\\.[A-Za-z0-9-]+)+):(\\d{1,5})(?![\\d.])");

    public static String a(String str) {
        if (str == null) {
            return "🌐";
        }
        Pattern patternCompile = Pattern.compile("[A-Za-z]{2}");
        jc.i.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(str).matches()) {
            return "🌐";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.appendCodePoint(Character.toUpperCase(str.charAt(0)) - 3675);
            sb2.appendCodePoint(Character.toUpperCase(str.charAt(1)) - 3675);
            return sb2.toString();
        } catch (Throwable unused) {
            return "🌐";
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        Pattern patternCompile = Pattern.compile("[A-Za-z]{2}");
        jc.i.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(str).matches()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("https://flagcdn.com/h40/");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        jc.i.d(lowerCase, "toLowerCase(...)");
        sb2.append(lowerCase);
        sb2.append(".png");
        return sb2.toString();
    }

    public static String c(c cVar) {
        String str;
        jc.i.e(cVar, "e");
        if (!cVar.i || (str = cVar.f7250f) == null) {
            return null;
        }
        return b(str);
    }

    public static String d(c cVar) {
        String str;
        jc.i.e(cVar, "e");
        return (!cVar.i || (str = cVar.f7250f) == null) ? "❔" : a(str);
    }

    public static String e(String str) {
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[A-Za-z]{2}");
            jc.i.d(patternCompile, "compile(...)");
            if (patternCompile.matcher(str).matches()) {
                try {
                    String displayCountry = new Locale("", str).getDisplayCountry();
                    if (displayCountry != null) {
                        return displayCountry;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return "";
    }
}
