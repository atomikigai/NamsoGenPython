package j5;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import l5.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f5688d;
    public static final a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f5689f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5691b;

    static {
        String strY = com.bumptech.glide.c.y("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5687c = strY;
        String strY2 = com.bumptech.glide.c.y("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strY3 = com.bumptech.glide.c.y("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5688d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new i5.b("proto"), new i5.b("json"))));
        e = new a(strY, null);
        f5689f = new a(strY2, strY3);
    }

    public a(String str, String str2) {
        this.f5690a = str;
        this.f5691b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
