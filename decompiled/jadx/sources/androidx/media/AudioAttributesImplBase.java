package androidx.media;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1116a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1117b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1118c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1119d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1117b == audioAttributesImplBase.f1117b) {
            int i10 = this.f1118c;
            int i11 = audioAttributesImplBase.f1118c;
            int i12 = audioAttributesImplBase.f1119d;
            if (i12 == -1) {
                int i13 = audioAttributesImplBase.f1116a;
                int i14 = AudioAttributesCompat.f1112b;
                if ((i11 & 1) != 1) {
                    i = 4;
                    if ((i11 & 4) != 4) {
                        switch (i13) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 12:
                            default:
                                i = 3;
                                break;
                            case 13:
                                i = 1;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i12;
            }
            if (i == 6) {
                i11 |= 4;
            } else if (i == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f1116a == audioAttributesImplBase.f1116a && this.f1119d == i12) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1117b), Integer.valueOf(this.f1118c), Integer.valueOf(this.f1116a), Integer.valueOf(this.f1119d)});
    }

    public final String toString() {
        String strF;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f1119d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f1119d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i = this.f1116a;
        int i10 = AudioAttributesCompat.f1112b;
        switch (i) {
            case 0:
                strF = "USAGE_UNKNOWN";
                break;
            case 1:
                strF = "USAGE_MEDIA";
                break;
            case 2:
                strF = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strF = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strF = "USAGE_ALARM";
                break;
            case 5:
                strF = "USAGE_NOTIFICATION";
                break;
            case 6:
                strF = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strF = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strF = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strF = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strF = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strF = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strF = "USAGE_GAME";
                break;
            case 15:
            default:
                strF = v.f(i, "unknown usage ");
                break;
            case 16:
                strF = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strF);
        sb2.append(" content=");
        sb2.append(this.f1117b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f1118c).toUpperCase());
        return sb2.toString();
    }
}
