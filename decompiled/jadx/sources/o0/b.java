package o0;

import android.text.SpannableStringBuilder;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f7439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7440d;
    public static final b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7441a;

    static {
        ea.e eVar = g.f7449c;
        f7438b = Character.toString((char) 8206);
        f7439c = Character.toString((char) 8207);
        f7440d = new b(false);
        e = new b(true);
    }

    public b(boolean z4) {
        ea.e eVar = g.f7447a;
        this.f7441a = z4;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f7436c = 0;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = aVar.f7436c;
            if (i12 < aVar.f7435b && i == 0) {
                CharSequence charSequence2 = aVar.f7434a;
                char cCharAt = charSequence2.charAt(i12);
                aVar.f7437d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f7436c);
                    aVar.f7436c = Character.charCount(iCodePointAt) + aVar.f7436c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f7436c++;
                    char c10 = aVar.f7437d;
                    directionality = c10 < 1792 ? a.e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i11++;
                                i10 = -1;
                                continue;
                            case 16:
                            case 17:
                                i11++;
                                i10 = 1;
                                continue;
                            case 18:
                                i11--;
                                i10 = 0;
                                continue;
                        }
                    }
                } else if (i11 == 0) {
                    return -1;
                }
                i = i11;
            }
        }
        if (i != 0) {
            if (i10 == 0) {
                while (aVar.f7436c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i == i11) {
                                return -1;
                            }
                            i11--;
                            break;
                        case 16:
                        case 17:
                            if (i == i11) {
                                return 1;
                            }
                            i11--;
                            break;
                        case 18:
                            i11++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i10;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f7436c = aVar.f7435b;
        int i = 0;
        while (true) {
            int i10 = i;
            while (aVar.f7436c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i10 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i10 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i10 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i10 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i10 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        ea.e eVar = g.f7449c;
        if (charSequence == null) {
            return null;
        }
        boolean zC = eVar.c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zC2 = (zC ? g.f7448b : g.f7447a).c(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f7439c;
        String str4 = f7438b;
        boolean z4 = this.f7441a;
        if (z4 || !(zC2 || a(charSequence) == 1)) {
            str = (!z4 || (zC2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zC != z4) {
            spannableStringBuilder.append(zC ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zC3 = (zC ? g.f7448b : g.f7447a).c(charSequence, charSequence.length());
        if (!z4 && (zC3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z4 && (!zC3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
