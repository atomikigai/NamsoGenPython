package o0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final byte[] e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f7434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f7437d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f7434a = charSequence;
        this.f7435b = charSequence.length();
    }

    public final byte a() {
        int i = this.f7436c - 1;
        CharSequence charSequence = this.f7434a;
        char cCharAt = charSequence.charAt(i);
        this.f7437d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f7436c);
            this.f7436c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f7436c--;
        char c10 = this.f7437d;
        return c10 < 1792 ? e[c10] : Character.getDirectionality(c10);
    }
}
