package a2;

import android.net.Uri;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.FcmApi;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import app.namso_gen.spacehowen.SettingsActivity;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.zzbbs;
import h3.a2;
import h3.e1;
import h3.x2;
import java.util.List;
import rc.a0;
import y1.l0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ac.i implements ic.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e1 e1Var, int i, yb.d dVar) {
        super(2, dVar);
        this.f22a = 7;
        this.f25d = e1Var;
        this.f23b = i;
    }

    @Override // ac.a
    public final yb.d create(Object obj, yb.d dVar) {
        switch (this.f22a) {
            case 0:
                return new g((ic.p) this.f24c, (v) this.f25d, dVar, 0);
            case 1:
                return new g((ic.p) this.f24c, (jc.q) this.f25d, dVar, 1);
            case 2:
                return new g((l) this.f24c, (CheckerHistoryActivity) this.f25d, dVar, 2);
            case 3:
                return new g((CheckerHistoryActivity) this.f24c, (i3.a) this.f25d, dVar, 3);
            case 4:
                g gVar = new g((FcmApi) this.f25d, dVar, 4);
                gVar.f24c = obj;
                return gVar;
            case 5:
                return new g((i3.n) this.f24c, (i3.o) this.f25d, dVar, 5);
            case 6:
                return new g((e1) this.f24c, (Purchase) this.f25d, dVar, 6);
            case 7:
                g gVar2 = new g((e1) this.f25d, this.f23b, dVar);
                gVar2.f24c = obj;
                return gVar2;
            case 8:
                return new g((e1) this.f24c, (v9.n) this.f25d, dVar, 8);
            case 9:
                return new g((e1) this.f24c, (String) this.f25d, dVar, 9);
            case 10:
                return new g((a2) this.f24c, (i3.f) this.f25d, dVar, 10);
            case 11:
                return new g((a2) this.f24c, (String) this.f25d, dVar, 11);
            case 12:
                return new g((NotificationHistoryActivity) this.f24c, (i3.o) this.f25d, dVar, 12);
            case 13:
                return new g((String) this.f24c, (SettingsActivity) this.f25d, dVar, 13);
            case 14:
                return new g((Purchase) this.f24c, (SettingsActivity) this.f25d, dVar, 14);
            case 15:
                return new g((x2) this.f24c, (String) this.f25d, dVar, 15);
            case 16:
                return new g((x2) this.f24c, (List) this.f25d, dVar, 16);
            case 17:
                return new g((l3.i) this.f24c, (l3.d) this.f25d, dVar, 17);
            case 18:
                return new g((l3.y) this.f24c, (k3.m) this.f25d, dVar, 18);
            case 19:
                return new g((androidx.viewpager2.adapter.c) this.f24c, (lb.q) this.f25d, dVar, 19);
            case 20:
                return new g((nb.h) this.f25d, dVar, 20);
            case zzbbs.zzt.zzm /* 21 */:
                return new g((r1.a) this.f24c, (Uri) this.f25d, dVar, 21);
            case 22:
                return new g((s1.a) this.f24c, (u1.a) this.f25d, dVar, 22);
            case 23:
                g gVar3 = new g((uc.c) this.f25d, dVar, 23);
                gVar3.f24c = obj;
                return gVar3;
            case 24:
                return new g((l0) this.f24c, (ic.a) this.f25d, dVar, 24);
            case 25:
                g gVar4 = new g((List) this.f25d, dVar, 25);
                gVar4.f24c = obj;
                return gVar4;
            case 26:
                return new g((gb.r) this.f25d, dVar, 26);
            default:
                return new g((ic.p) this.f24c, this.f25d, dVar, 27);
        }
    }

    @Override // ic.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f22a) {
            case 0:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 1:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 2:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 3:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 4:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 5:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 6:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 7:
                g gVar = (g) create((d1.b) obj, (yb.d) obj2);
                ub.k kVar = ub.k.f9073a;
                gVar.invokeSuspend(kVar);
                return kVar;
            case 8:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 9:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 10:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 11:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 12:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 13:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 14:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 15:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 16:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 17:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 18:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 19:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 20:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case zzbbs.zzt.zzm /* 21 */:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 22:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 23:
                return ((g) create(obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 24:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 25:
                return ((g) create((z0.r) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            case 26:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
            default:
                return ((g) create((a0) obj, (yb.d) obj2)).invokeSuspend(ub.k.f9073a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0108 A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112 A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x011a A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:552:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014e A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x0168 A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016c A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0174 A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x017c A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0184 A[Catch: all -> 0x010d, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x018a A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #4 {all -> 0x010d, blocks: (B:46:0x0102, B:48:0x0108, B:52:0x0112, B:54:0x011a, B:55:0x011d, B:56:0x0124, B:58:0x012f, B:59:0x013b, B:61:0x014e, B:67:0x015b, B:69:0x0164, B:70:0x0168, B:72:0x016c, B:74:0x0174, B:75:0x0178, B:77:0x017c, B:78:0x0184, B:79:0x0189, B:80:0x018a), top: B:547:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x019e  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03cd, code lost:
    
        if (r8 == r7) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b3, code lost:
    
        if (r7.invoke(r3, r27) == r4) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, rc.k] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v55, types: [int] */
    /* JADX WARN: Type inference failed for: r6v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.ViewGroup, android.widget.RadioGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Object, tc.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01b3 -> B:92:0x01b7). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, yb.d dVar, int i) {
        super(2, dVar);
        this.f22a = i;
        this.f24c = obj;
        this.f25d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, yb.d dVar, int i) {
        super(2, dVar);
        this.f22a = i;
        this.f25d = obj;
    }
}
