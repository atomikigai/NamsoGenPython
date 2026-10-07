package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdd {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:219:0x0313  */
    /* JADX WARN: Code duplicated, block: B:221:0x031a  */
    /* JADX WARN: Code duplicated, block: B:225:0x0326 A[Catch: NumberFormatException -> 0x03de, TryCatch #2 {NumberFormatException -> 0x03de, blocks: (B:223:0x031e, B:225:0x0326, B:227:0x033d, B:278:0x03ce), top: B:342:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:226:0x033b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x033d A[Catch: NumberFormatException -> 0x03de, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x03de, blocks: (B:223:0x031e, B:225:0x0326, B:227:0x033d, B:278:0x03ce), top: B:342:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:230:0x034d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0351  */
    /* JADX WARN: Code duplicated, block: B:234:0x0355  */
    /* JADX WARN: Code duplicated, block: B:236:0x0359  */
    /* JADX WARN: Code duplicated, block: B:238:0x035d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0361  */
    /* JADX WARN: Code duplicated, block: B:242:0x0365  */
    /* JADX WARN: Code duplicated, block: B:243:0x0367  */
    /* JADX WARN: Code duplicated, block: B:244:0x036a  */
    /* JADX WARN: Code duplicated, block: B:245:0x036d  */
    /* JADX WARN: Code duplicated, block: B:246:0x036f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0372  */
    /* JADX WARN: Code duplicated, block: B:248:0x0374  */
    /* JADX WARN: Code duplicated, block: B:250:0x0377  */
    /* JADX WARN: Code duplicated, block: B:252:0x037d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0380  */
    /* JADX WARN: Code duplicated, block: B:254:0x0383  */
    /* JADX WARN: Code duplicated, block: B:255:0x0386  */
    /* JADX WARN: Code duplicated, block: B:256:0x0389  */
    /* JADX WARN: Code duplicated, block: B:257:0x038c  */
    /* JADX WARN: Code duplicated, block: B:258:0x038e  */
    /* JADX WARN: Code duplicated, block: B:259:0x0391  */
    /* JADX WARN: Code duplicated, block: B:260:0x0395  */
    /* JADX WARN: Code duplicated, block: B:261:0x0398  */
    /* JADX WARN: Code duplicated, block: B:262:0x039a  */
    /* JADX WARN: Code duplicated, block: B:263:0x039d  */
    /* JADX WARN: Code duplicated, block: B:264:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:265:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:266:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:267:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:268:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:269:0x03af  */
    /* JADX WARN: Code duplicated, block: B:270:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:271:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:272:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:274:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:276:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:278:0x03ce A[Catch: NumberFormatException -> 0x03de, TRY_ENTER, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x03de, blocks: (B:223:0x031e, B:225:0x0326, B:227:0x033d, B:278:0x03ce), top: B:342:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:342:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02ee, code lost:
    
        if (r4.equals("hvc1") != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02f7, code lost:
    
        if (r4.equals("hev1") != false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0301, code lost:
    
        return zzb(r23.zzk, r7, r23.zzB);
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v84 int, still in use, count: 1, list:
      (r1v84 int) from 0x008e: IF  (r1v84 int) != (1567 int)  -> B:20:0x0090 A[HIDDEN] (LINE:143)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v84 int, still in use, count: 1, list:
      (r1v84 int) from 0x008e: IF  (r1v84 int) != (1567 int)  -> B:20:0x0090 A[HIDDEN] (LINE:143)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:278:0x03ce, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzad r23) {
        /*
            Method dump skipped, instruction units count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.zza(com.google.android.gms.internal.ads.zzad):android.util.Pair");
    }

    public static Pair zzb(String str, String[] strArr, zzm zzmVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            q1.a.s(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            q1.a.s(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else {
            i = 6;
            if ("2".equals(strGroup)) {
                i = (zzmVar == null || zzmVar.zzd != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                q1.a.s(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    num = 2;
                    break;
                case "H60":
                    num = 8;
                    break;
                case "H63":
                    num = 32;
                    break;
                case "H90":
                    num = 128;
                    break;
                case "H93":
                    num = 512;
                    break;
                case "L30":
                    num = 1;
                    break;
                case "L60":
                    num = 4;
                    break;
                case "L63":
                    num = 16;
                    break;
                case "L90":
                    num = 64;
                    break;
                case "L93":
                    num = 256;
                    break;
                case "H120":
                    num = 2048;
                    break;
                case "H123":
                    num = 8192;
                    break;
                case "H150":
                    num = 32768;
                    break;
                case "H153":
                    num = 131072;
                    break;
                case "H156":
                    num = 524288;
                    break;
                case "H180":
                    num = 2097152;
                    break;
                case "H183":
                    num = 8388608;
                    break;
                case "H186":
                    num = 33554432;
                    break;
                case "L120":
                    num = 1024;
                    break;
                case "L123":
                    num = 4096;
                    break;
                case "L150":
                    num = 16384;
                    break;
                case "L153":
                    num = 65536;
                    break;
                case "L156":
                    num = 262144;
                    break;
                case "L180":
                    num = 1048576;
                    break;
                case "L183":
                    num = 4194304;
                    break;
                case "L186":
                    num = 16777216;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i), num);
        }
        q1.a.s(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
        return null;
    }

    public static String zzc(int i, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String zzd(int i, boolean z4, int i10, int i11, int[] iArr, int i12) {
        int i13;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", zzc[i], Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(true != z4 ? 'L' : 'H'), Integer.valueOf(i12)));
        int i14 = 6;
        while (true) {
            if (i14 <= 0) {
                break;
            }
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (i13 = 0; i13 < i14; i13++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i13])));
        }
        return sb2.toString();
    }

    public static byte[] zze(byte[] bArr, int i, int i10) {
        byte[] bArr2 = new byte[i10 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i10);
        return bArr2;
    }
}
