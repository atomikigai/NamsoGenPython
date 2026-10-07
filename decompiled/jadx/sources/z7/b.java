package z7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzoy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11020d;
    public HashSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r.e f11021f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Long f11022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Long f11023s;

    /* JADX WARN: Code duplicated, block: B:109:0x025e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0268  */
    /* JADX WARN: Code duplicated, block: B:115:0x0271  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c  */
    /* JADX WARN: Code duplicated, block: B:123:0x02aa A[Catch: all -> 0x02c5, SQLiteException -> 0x02c7, LOOP:11: B:123:0x02aa->B:548:?, LOOP_START, TryCatch #18 {all -> 0x02c5, blocks: (B:121:0x02a4, B:123:0x02aa, B:125:0x02bb, B:131:0x02c9, B:134:0x02de, B:145:0x02ef), top: B:483:0x0298 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02bb A[Catch: all -> 0x02c5, SQLiteException -> 0x02c7, TryCatch #18 {all -> 0x02c5, blocks: (B:121:0x02a4, B:123:0x02aa, B:125:0x02bb, B:131:0x02c9, B:134:0x02de, B:145:0x02ef), top: B:483:0x0298 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02de A[Catch: all -> 0x02c5, SQLiteException -> 0x02c7, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x02c5, blocks: (B:121:0x02a4, B:123:0x02aa, B:125:0x02bb, B:131:0x02c9, B:134:0x02de, B:145:0x02ef), top: B:483:0x0298 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x031d  */
    /* JADX WARN: Code duplicated, block: B:154:0x032b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0342  */
    /* JADX WARN: Code duplicated, block: B:182:0x041b  */
    /* JADX WARN: Code duplicated, block: B:186:0x042c  */
    /* JADX WARN: Code duplicated, block: B:188:0x044c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0463  */
    /* JADX WARN: Code duplicated, block: B:198:0x047f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0488  */
    /* JADX WARN: Code duplicated, block: B:203:0x0496  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:215:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:220:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:222:0x0516  */
    /* JADX WARN: Code duplicated, block: B:223:0x051a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0533 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0552  */
    /* JADX WARN: Code duplicated, block: B:241:0x056e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0580  */
    /* JADX WARN: Code duplicated, block: B:247:0x058d  */
    /* JADX WARN: Code duplicated, block: B:254:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:257:0x05df  */
    /* JADX WARN: Code duplicated, block: B:261:0x0607  */
    /* JADX WARN: Code duplicated, block: B:262:0x0642  */
    /* JADX WARN: Code duplicated, block: B:265:0x068a  */
    /* JADX WARN: Code duplicated, block: B:271:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:278:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:284:0x0700  */
    /* JADX WARN: Code duplicated, block: B:295:0x072d A[LOOP:3: B:272:0x06cb->B:295:0x072d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:296:0x0730  */
    /* JADX WARN: Code duplicated, block: B:298:0x0736 A[PHI: r0 r18
      0x0736: PHI (r0v136 java.util.Map) = (r0v138 java.util.Map), (r0v146 java.util.Map) binds: [B:311:0x0762, B:297:0x0734] A[DONT_GENERATE, DONT_INLINE]
      0x0736: PHI (r18v19 android.database.Cursor) = (r18v20 android.database.Cursor), (r18v24 android.database.Cursor) binds: [B:311:0x0762, B:297:0x0734] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:317:0x076f  */
    /* JADX WARN: Code duplicated, block: B:321:0x077f  */
    /* JADX WARN: Code duplicated, block: B:327:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:329:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:331:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:334:0x07fd A[LOOP:5: B:325:0x07a8->B:334:0x07fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:338:0x081d  */
    /* JADX WARN: Code duplicated, block: B:343:0x0832  */
    /* JADX WARN: Code duplicated, block: B:346:0x0841  */
    /* JADX WARN: Code duplicated, block: B:348:0x0854  */
    /* JADX WARN: Code duplicated, block: B:352:0x088f  */
    /* JADX WARN: Code duplicated, block: B:359:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:365:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:376:0x08f8 A[LOOP:7: B:353:0x0891->B:376:0x08f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:379:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:381:0x0907 A[PHI: r0 r15 r18
      0x0907: PHI (r0v88 java.util.Map) = (r0v90 java.util.Map), (r0v95 java.util.Map) binds: [B:392:0x0933, B:380:0x0905] A[DONT_GENERATE, DONT_INLINE]
      0x0907: PHI (r15v4 android.database.Cursor) = (r15v5 android.database.Cursor), (r15v6 android.database.Cursor) binds: [B:392:0x0933, B:380:0x0905] A[DONT_GENERATE, DONT_INLINE]
      0x0907: PHI (r18v10 java.lang.String) = (r18v11 java.lang.String), (r18v15 java.lang.String) binds: [B:392:0x0933, B:380:0x0905] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:399:0x0941  */
    /* JADX WARN: Code duplicated, block: B:403:0x0952  */
    /* JADX WARN: Code duplicated, block: B:407:0x0973  */
    /* JADX WARN: Code duplicated, block: B:410:0x0984  */
    /* JADX WARN: Code duplicated, block: B:412:0x099a  */
    /* JADX WARN: Code duplicated, block: B:414:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:416:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:418:0x09de  */
    /* JADX WARN: Code duplicated, block: B:421:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:434:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:435:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a60 A[PHI: r6 r17
      0x0a60: PHI (r6v24 java.lang.Integer) = (r6v25 java.lang.Integer), (r6v26 java.lang.Integer) binds: [B:438:0x0a5e, B:436:0x0a51] A[DONT_GENERATE, DONT_INLINE]
      0x0a60: PHI (r17v19 java.lang.String) = (r17v20 java.lang.String), (r6v21 java.lang.String) binds: [B:438:0x0a5e, B:436:0x0a51] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:444:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:49:0x015c A[PHI: r0 r7 r16 r18
      0x015c: PHI (r0v178 java.util.Map) = (r0v180 java.util.Map), (r0v9 java.util.Map) binds: [B:61:0x0183, B:48:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r7v29 android.database.Cursor) = (r7v30 android.database.Cursor), (r7v31 android.database.Cursor) binds: [B:61:0x0183, B:48:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r16v29 boolean) = (r16v30 boolean), (r16v34 boolean) binds: [B:61:0x0183, B:48:0x0158] A[DONT_GENERATE, DONT_INLINE]
      0x015c: PHI (r18v32 java.lang.String) = (r18v33 java.lang.String), (r18v36 java.lang.String) binds: [B:61:0x0183, B:48:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:518:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x05d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0728 A[EDGE_INSN: B:522:0x0728->B:294:0x0728 BREAK  A[LOOP:3: B:272:0x06cb->B:295:0x072d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x079d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0791 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x0814 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x080e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x08f3 A[EDGE_INSN: B:533:0x08f3->B:375:0x08f3 BREAK  A[LOOP:7: B:353:0x0891->B:376:0x08f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0964 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x0a65 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x09f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0a5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x0ae1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0a7f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x04b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x04a7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x0594 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x0348 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x0229 A[EDGE_INSN: B:584:0x0229->B:93:0x0229 BREAK  A[LOOP:20: B:80:0x01df->B:94:0x022e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4 A[Catch: all -> 0x01ce, SQLiteException -> 0x01d1, TRY_LEAVE, TryCatch #26 {all -> 0x01ce, blocks: (B:69:0x01be, B:71:0x01c4, B:79:0x01da, B:80:0x01df, B:81:0x01e9, B:82:0x01f9, B:91:0x0223, B:84:0x0208, B:88:0x0216, B:90:0x021c, B:107:0x0249), top: B:496:0x01be }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01da A[Catch: all -> 0x01ce, SQLiteException -> 0x01d1, TRY_ENTER, TryCatch #26 {all -> 0x01ce, blocks: (B:69:0x01be, B:71:0x01c4, B:79:0x01da, B:80:0x01df, B:81:0x01e9, B:82:0x01f9, B:91:0x0223, B:84:0x0208, B:88:0x0216, B:90:0x021c, B:107:0x0249), top: B:496:0x01be }] */
    /* JADX WARN: Code duplicated, block: B:94:0x022e A[LOOP:20: B:80:0x01df->B:94:0x022e, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v194 */
    /* JADX WARN: Type inference failed for: r0v195 */
    /* JADX WARN: Type inference failed for: r0v30, types: [r.e, r.k] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v12, types: [r.e] */
    /* JADX WARN: Type inference failed for: r12v13, types: [r.k] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v35 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v16, types: [r.e, r.k] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList g(String str, List list, List list2, Long l2, Long l10) throws Throwable {
        boolean z4;
        boolean z10;
        Map map;
        a1 a1Var;
        String str2;
        Cursor cursorQuery;
        a1 a1Var2;
        String str3;
        Map map2;
        String str4;
        a1 a1Var3;
        Map map3;
        Map map4;
        String str5;
        zzgi zzgiVar;
        BitSet bitSet;
        BitSet bitSet2;
        r.e eVar;
        zzgi zzgiVar2;
        r.e eVar2;
        List<zzek> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z11;
        Iterator it;
        zzgk zzgkVar;
        Long lValueOf;
        j jVarG;
        String str6;
        ?? eVar3;
        ?? r10;
        Cursor cursorRawQuery;
        ?? r11;
        r.e eVar4;
        Iterator it2;
        Integer num;
        zzgi zzgiVar3;
        List list4;
        ?? r17;
        Iterator it3;
        a1 a1Var4;
        Integer numValueOf2;
        List arrayList;
        String str7;
        String str8;
        ArrayList arrayList2;
        j jVarG2;
        a1 a1Var5;
        String str9;
        ContentValues contentValues;
        ?? eVar5;
        Iterator it4;
        String strZzf;
        Map map5;
        String str10;
        Map map6;
        int iIntValue;
        Iterator it5;
        boolean zB;
        Integer num2;
        zzet zzetVar;
        Integer numValueOf3;
        h3 h3Var;
        int i10;
        boolean z12;
        Integer numValueOf4;
        a1 a1Var6;
        String str11;
        r.e eVar6;
        Cursor cursor;
        a1 a1Var7;
        String str12;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        fd.l lVar;
        ?? eVar7;
        Iterator it6;
        zzft zzftVar;
        zzft zzftVarC;
        a1 a1Var8;
        String str13;
        String strZzh;
        n nVarZ;
        n nVar;
        String strZzh2;
        Map map7;
        int iIntValue2;
        Iterator it7;
        boolean zA;
        ?? r12;
        Map map8;
        fd.l lVar2;
        ?? r29;
        Integer num3;
        h3 h3Var2;
        ?? r210;
        int iZzb;
        g3 g3Var;
        boolean z13;
        int i11;
        a1 a1Var9;
        String str14;
        r.e eVar8;
        a1 a1Var10;
        Cursor cursor2;
        String str15;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf6;
        List list6;
        List arrayList4;
        r.e eVar9;
        int i12;
        ?? r13;
        Cursor cursorQuery4;
        List arrayList5;
        a1 a1Var11 = (a1) this.f159a;
        com.google.android.gms.common.internal.i0.e(str);
        com.google.android.gms.common.internal.i0.i(list);
        com.google.android.gms.common.internal.i0.i(list2);
        this.f11020d = str;
        this.e = new HashSet();
        this.f11021f = new r.e();
        this.f11022r = l2;
        this.f11023s = l10;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                z4 = false;
                break;
            }
            if ("_s".equals(((zzft) it8.next()).zzh())) {
                z4 = true;
                break;
            }
        }
        zzoy.zzc();
        boolean zL = a1Var11.f11005r.l(this.f11020d, z.X);
        zzoy.zzc();
        boolean zL2 = a1Var11.f11005r.l(this.f11020d, z.W);
        z2 z2Var = this.f11411b;
        if (z4) {
            j jVarG3 = z2Var.G();
            String str16 = this.f11020d;
            jVarG3.d();
            jVarG3.c();
            com.google.android.gms.common.internal.i0.e(str16);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                jVarG3.v().update("events", contentValues2, "app_id = ?", new String[]{str16});
            } catch (SQLiteException e) {
                ((a1) jVarG3.f159a).zzaA().g().d(i0.k(str16), "Error resetting session-scoped event counts. appId", e);
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str17 = "Database error querying filters. appId";
        String str18 = "data";
        String str19 = "audience_id";
        try {
            try {
                try {
                    if (zL2 && zL) {
                        j jVarG4 = z2Var.G();
                        a1 a1Var12 = (a1) jVarG4.f159a;
                        String str20 = this.f11020d;
                        com.google.android.gms.common.internal.i0.e(str20);
                        r.e eVar10 = new r.e();
                        try {
                            try {
                                cursorQuery4 = jVarG4.v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str20}, null, null, null);
                                try {
                                    if (cursorQuery4.moveToFirst()) {
                                        z10 = z4;
                                        while (true) {
                                            try {
                                                try {
                                                    zzek zzekVar = (zzek) ((zzej) l0.B(zzek.zzc(), cursorQuery4.getBlob(1))).zzaD();
                                                    if (zzekVar.zzo()) {
                                                        Integer numValueOf7 = Integer.valueOf(cursorQuery4.getInt(0));
                                                        List list7 = (List) eVar10.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            eVar10.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(zzekVar);
                                                    } else {
                                                        str18 = str18;
                                                    }
                                                } catch (IOException e4) {
                                                    str18 = str18;
                                                    a1Var12.zzaA().g().d(i0.k(str20), "Failed to merge filter. appId", e4);
                                                }
                                                try {
                                                    if (!cursorQuery4.moveToNext()) {
                                                        break;
                                                    }
                                                    str18 = str18;
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    a1Var12.zzaA().g().d(i0.k(str20), "Database error querying filters. appId", e);
                                                    map9 = Collections.EMPTY_MAP;
                                                    if (cursorQuery4 != null) {
                                                        cursorQuery4.close();
                                                    }
                                                    map = map9;
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                str18 = str18;
                                                a1Var12.zzaA().g().d(i0.k(str20), "Database error querying filters. appId", e);
                                                map9 = Collections.EMPTY_MAP;
                                                if (cursorQuery4 != null) {
                                                    cursorQuery4.close();
                                                }
                                                map = map9;
                                                j jVarG5 = z2Var.G();
                                                a1Var = (a1) jVarG5.f159a;
                                                str2 = this.f11020d;
                                                jVarG5.d();
                                                jVarG5.c();
                                                com.google.android.gms.common.internal.i0.e(str2);
                                                cursorQuery = jVarG5.v().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    eVar9 = new r.e();
                                                    while (true) {
                                                        i12 = cursorQuery.getInt(0);
                                                        try {
                                                            eVar9.put(Integer.valueOf(i12), (zzgi) ((zzgh) l0.B(zzgi.zze(), cursorQuery.getBlob(1))).zzaD());
                                                            a1Var2 = a1Var;
                                                            str3 = str17;
                                                        } catch (IOException e12) {
                                                            a1Var2 = a1Var;
                                                            str3 = str17;
                                                            try {
                                                                a1Var.zzaA().g().e("Failed to merge filter results. appId, audienceId, error", i0.k(str2), Integer.valueOf(i12), e12);
                                                            } catch (SQLiteException e13) {
                                                                e = e13;
                                                                str2 = str2;
                                                                a1Var2.zzaA().g().d(i0.k(str2), "Database error querying filter results. appId", e);
                                                                Map map10 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map10;
                                                                if (map2.isEmpty()) {
                                                                    str5 = "audience_id";
                                                                    a1Var3 = a1Var11;
                                                                } else {
                                                                    HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                    if (z10) {
                                                                        String str21 = this.f11020d;
                                                                        jVarG = z2Var.G();
                                                                        str6 = this.f11020d;
                                                                        jVarG.d();
                                                                        jVarG.c();
                                                                        com.google.android.gms.common.internal.i0.e(str6);
                                                                        eVar3 = new r.e();
                                                                        try {
                                                                            try {
                                                                                cursorRawQuery = jVarG.v().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                try {
                                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                                        do {
                                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                            arrayList = (List) eVar3.get(numValueOf2);
                                                                                            if (arrayList == null) {
                                                                                                arrayList = new ArrayList();
                                                                                                eVar3.put(numValueOf2, arrayList);
                                                                                            }
                                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                        } while (cursorRawQuery.moveToNext());
                                                                                    } else {
                                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                                    }
                                                                                } catch (SQLiteException e14) {
                                                                                    e = e14;
                                                                                    ((a1) jVarG.f159a).zzaA().g().d(i0.k(str6), "Database error querying scoped filters. appId", e);
                                                                                    eVar3 = Collections.EMPTY_MAP;
                                                                                    r11 = eVar3;
                                                                                    if (cursorRawQuery != null) {
                                                                                    }
                                                                                    com.google.android.gms.common.internal.i0.e(str21);
                                                                                    eVar4 = new r.e();
                                                                                    if (!map2.isEmpty()) {
                                                                                        it2 = map2.keySet().iterator();
                                                                                        while (it2.hasNext()) {
                                                                                            num = (Integer) it2.next();
                                                                                            num.getClass();
                                                                                            zzgiVar3 = (zzgi) map2.get(num);
                                                                                            list4 = (List) r11.get(num);
                                                                                            if (list4 != null) {
                                                                                            }
                                                                                            r17 = r11;
                                                                                            it3 = it2;
                                                                                            a1Var4 = a1Var11;
                                                                                            eVar4.put(num, zzgiVar3);
                                                                                            r11 = r17;
                                                                                            it2 = it3;
                                                                                            str19 = str19;
                                                                                            a1Var11 = a1Var4;
                                                                                        }
                                                                                    }
                                                                                    str4 = str19;
                                                                                    a1Var3 = a1Var11;
                                                                                    map3 = eVar4;
                                                                                    map4 = map;
                                                                                    for (Integer num4 : hashSet) {
                                                                                        num4.getClass();
                                                                                        zzgiVar = (zzgi) map3.get(num4);
                                                                                        bitSet = new BitSet();
                                                                                        bitSet2 = new BitSet();
                                                                                        eVar = new r.e();
                                                                                        if (zzgiVar != null) {
                                                                                            for (zzfr zzfrVar : zzgiVar.zzh()) {
                                                                                                if (zzfrVar.zzh()) {
                                                                                                    zzgi zzgiVar4 = zzgiVar;
                                                                                                    Integer numValueOf8 = Integer.valueOf(zzfrVar.zza());
                                                                                                    if (zzfrVar.zzg()) {
                                                                                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                                                                                    } else {
                                                                                                        lValueOf = null;
                                                                                                    }
                                                                                                    eVar.put(numValueOf8, lValueOf);
                                                                                                    zzgiVar = zzgiVar4;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        zzgiVar2 = zzgiVar;
                                                                                        eVar2 = new r.e();
                                                                                        if (zzgiVar2 != null) {
                                                                                            it = zzgiVar2.zzj().iterator();
                                                                                            while (it.hasNext()) {
                                                                                                zzgkVar = (zzgk) it.next();
                                                                                                if (!zzgkVar.zzi()) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        Map map11 = map3;
                                                                                        if (zzgiVar2 != null) {
                                                                                            i = 0;
                                                                                            while (i < zzgiVar2.zzd() * 64) {
                                                                                                if (l0.J(i, zzgiVar2.zzk())) {
                                                                                                    z11 = zL;
                                                                                                    a1Var3.zzaA().h().d(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
                                                                                                    bitSet2.set(i);
                                                                                                    if (l0.J(i, zzgiVar2.zzi())) {
                                                                                                        bitSet.set(i);
                                                                                                    }
                                                                                                    i++;
                                                                                                    zL = z11;
                                                                                                } else {
                                                                                                    z11 = zL;
                                                                                                }
                                                                                                eVar.remove(Integer.valueOf(i));
                                                                                                i++;
                                                                                                zL = z11;
                                                                                            }
                                                                                        }
                                                                                        boolean z14 = zL;
                                                                                        zzgi zzgiVar5 = (zzgi) map2.get(num4);
                                                                                        if (zL2) {
                                                                                            for (zzek zzekVar2 : list3) {
                                                                                                int iZzb2 = zzekVar2.zzb();
                                                                                                Integer num5 = num4;
                                                                                                jLongValue = this.f11023s.longValue() / 1000;
                                                                                                if (zzekVar2.zzm()) {
                                                                                                    jLongValue = this.f11022r.longValue() / 1000;
                                                                                                }
                                                                                                numValueOf = Integer.valueOf(iZzb2);
                                                                                                if (eVar.containsKey(numValueOf)) {
                                                                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                }
                                                                                                if (eVar2.containsKey(numValueOf)) {
                                                                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                }
                                                                                                num4 = num5;
                                                                                            }
                                                                                        }
                                                                                        this.f11021f.put(num4, new g3(this, this.f11020d, zzgiVar5, bitSet, bitSet2, eVar, eVar2));
                                                                                        str18 = str18;
                                                                                        map2 = map2;
                                                                                        zL = z14;
                                                                                        map4 = map4;
                                                                                        map3 = map11;
                                                                                    }
                                                                                    str5 = str4;
                                                                                    str7 = str18;
                                                                                    String str22 = str3;
                                                                                    str8 = "Skipping failed audience ID";
                                                                                    if (!list.isEmpty()) {
                                                                                        lVar = new fd.l(this);
                                                                                        eVar7 = new r.e();
                                                                                        it6 = list.iterator();
                                                                                        while (it6.hasNext()) {
                                                                                            zzftVar = (zzft) it6.next();
                                                                                            zzftVarC = lVar.c(zzftVar, this.f11020d);
                                                                                            if (zzftVarC != null) {
                                                                                                j jVarG6 = z2Var.G();
                                                                                                a1Var8 = (a1) jVarG6.f159a;
                                                                                                str13 = this.f11020d;
                                                                                                strZzh = zzftVarC.zzh();
                                                                                                nVarZ = jVarG6.z(str13, zzftVar.zzh());
                                                                                                if (nVarZ == null) {
                                                                                                    a1Var8.zzaA().j().d(i0.k(str13), "Event aggregate wasn't created during raw event logging. appId, event", a1Var8.l().d(strZzh));
                                                                                                    nVar = new n(str13, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                                                                } else {
                                                                                                    nVar = new n(nVarZ.f11262a, nVarZ.f11263b, nVarZ.f11264c + 1, nVarZ.f11265d + 1, nVarZ.e + 1, nVarZ.f11266f, nVarZ.f11267g, nVarZ.h, nVarZ.i, nVarZ.f11268j, nVarZ.f11269k);
                                                                                                }
                                                                                                z2Var.G().k(nVar);
                                                                                                strZzh2 = zzftVarC.zzh();
                                                                                                map7 = (Map) eVar7.get(strZzh2);
                                                                                                if (map7 == null) {
                                                                                                    j jVarG7 = z2Var.G();
                                                                                                    a1Var9 = (a1) jVarG7.f159a;
                                                                                                    str14 = this.f11020d;
                                                                                                    jVarG7.d();
                                                                                                    jVarG7.c();
                                                                                                    com.google.android.gms.common.internal.i0.e(str14);
                                                                                                    com.google.android.gms.common.internal.i0.e(strZzh2);
                                                                                                    eVar8 = new r.e();
                                                                                                    try {
                                                                                                        try {
                                                                                                            a1Var10 = a1Var9;
                                                                                                            try {
                                                                                                                cursorQuery3 = jVarG7.v().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str14, strZzh2}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (cursorQuery3.moveToFirst()) {
                                                                                                                            str15 = str14;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        zzek zzekVar3 = (zzek) ((zzej) l0.B(zzek.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                                                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                                        list6 = (List) eVar8.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            cursor3 = cursorQuery3;
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                                    eVar8.put(numValueOf6, arrayList4);
                                                                                                                                                } catch (Throwable th) {
                                                                                                                                                    th = th;
                                                                                                                                                    cursor2 = cursor3;
                                                                                                                                                    if (cursor2 != null) {
                                                                                                                                                        cursor2.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                                e = e15;
                                                                                                                                                a1Var10.zzaA().g().d(i0.k(str15), str22, e);
                                                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                                                if (cursor3 != null) {
                                                                                                                                                    cursor3.close();
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            cursor3 = cursorQuery3;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(zzekVar3);
                                                                                                                                    } catch (IOException e16) {
                                                                                                                                        cursor3 = cursorQuery3;
                                                                                                                                        a1Var10.zzaA().g().d(i0.k(str15), "Failed to merge filter. appId", e16);
                                                                                                                                    }
                                                                                                                                    if (!cursor3.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    cursorQuery3 = cursor3;
                                                                                                                                } catch (SQLiteException e17) {
                                                                                                                                    e = e17;
                                                                                                                                    cursor3 = cursorQuery3;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            cursor3.close();
                                                                                                                            map7 = eVar8;
                                                                                                                        } else {
                                                                                                                            cursor3 = cursorQuery3;
                                                                                                                            map7 = Collections.EMPTY_MAP;
                                                                                                                            cursor3.close();
                                                                                                                        }
                                                                                                                    } catch (Throwable th2) {
                                                                                                                        th = th2;
                                                                                                                        cursor3 = cursorQuery3;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e18) {
                                                                                                                    e = e18;
                                                                                                                    cursor3 = cursorQuery3;
                                                                                                                    str15 = str14;
                                                                                                                }
                                                                                                            } catch (SQLiteException e19) {
                                                                                                                e = e19;
                                                                                                                str15 = str14;
                                                                                                                cursor3 = null;
                                                                                                                a1Var10.zzaA().g().d(i0.k(str15), str22, e);
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                if (cursor3 != null) {
                                                                                                                    cursor3.close();
                                                                                                                }
                                                                                                                eVar7.put(strZzh2, map7);
                                                                                                                for (Integer num6 : map7.keySet()) {
                                                                                                                    iIntValue2 = num6.intValue();
                                                                                                                    if (this.e.contains(num6)) {
                                                                                                                        a1Var3.zzaA().h().c(num6, "Skipping failed audience ID");
                                                                                                                    } else {
                                                                                                                        it7 = ((List) map7.get(num6)).iterator();
                                                                                                                        zA = true;
                                                                                                                        r12 = eVar7;
                                                                                                                        while (true) {
                                                                                                                            if (it7.hasNext()) {
                                                                                                                                map8 = map7;
                                                                                                                                lVar2 = lVar;
                                                                                                                                r29 = r12;
                                                                                                                                num3 = num6;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            zzek zzekVar4 = (zzek) it7.next();
                                                                                                                            map8 = map7;
                                                                                                                            lVar2 = lVar;
                                                                                                                            r210 = r12;
                                                                                                                            num3 = num6;
                                                                                                                            n nVar2 = nVar;
                                                                                                                            h3Var2 = new h3(this, this.f11020d, iIntValue2, zzekVar4, 0);
                                                                                                                            Long l11 = this.f11022r;
                                                                                                                            Long l12 = this.f11023s;
                                                                                                                            iZzb = zzekVar4.zzb();
                                                                                                                            g3Var = (g3) this.f11021f.get(num3);
                                                                                                                            if (g3Var == null) {
                                                                                                                                z13 = false;
                                                                                                                            } else {
                                                                                                                                z13 = g3Var.f11146d.get(iZzb);
                                                                                                                            }
                                                                                                                            i11 = iIntValue2;
                                                                                                                            nVar = nVar2;
                                                                                                                            zA = h3Var2.a(l11, l12, zzftVarC, nVar2.f11264c, nVar, z13);
                                                                                                                            if (zA) {
                                                                                                                                this.e.add(num3);
                                                                                                                                r29 = r210;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            h(num3).b(h3Var2);
                                                                                                                            iIntValue2 = i11;
                                                                                                                            num6 = num3;
                                                                                                                            lVar = lVar2;
                                                                                                                            map7 = map8;
                                                                                                                            r12 = r210;
                                                                                                                        }
                                                                                                                        if (!zA) {
                                                                                                                            this.e.add(num3);
                                                                                                                        }
                                                                                                                        lVar = lVar2;
                                                                                                                        map7 = map8;
                                                                                                                        eVar7 = r29;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th3) {
                                                                                                            th = th3;
                                                                                                            cursor2 = null;
                                                                                                        }
                                                                                                    } catch (SQLiteException e20) {
                                                                                                        e = e20;
                                                                                                        a1Var10 = a1Var9;
                                                                                                    }
                                                                                                    eVar7.put(strZzh2, map7);
                                                                                                }
                                                                                                while (r25.hasNext()) {
                                                                                                    iIntValue2 = num6.intValue();
                                                                                                    if (this.e.contains(num6)) {
                                                                                                        a1Var3.zzaA().h().c(num6, "Skipping failed audience ID");
                                                                                                    } else {
                                                                                                        it7 = ((List) map7.get(num6)).iterator();
                                                                                                        zA = true;
                                                                                                        r12 = eVar7;
                                                                                                        while (true) {
                                                                                                            if (it7.hasNext()) {
                                                                                                                map8 = map7;
                                                                                                                lVar2 = lVar;
                                                                                                                r29 = r12;
                                                                                                                num3 = num6;
                                                                                                                break;
                                                                                                            }
                                                                                                            zzek zzekVar5 = (zzek) it7.next();
                                                                                                            map8 = map7;
                                                                                                            lVar2 = lVar;
                                                                                                            r210 = r12;
                                                                                                            num3 = num6;
                                                                                                            n nVar3 = nVar;
                                                                                                            h3Var2 = new h3(this, this.f11020d, iIntValue2, zzekVar5, 0);
                                                                                                            Long l13 = this.f11022r;
                                                                                                            Long l14 = this.f11023s;
                                                                                                            iZzb = zzekVar5.zzb();
                                                                                                            g3Var = (g3) this.f11021f.get(num3);
                                                                                                            if (g3Var == null) {
                                                                                                                z13 = false;
                                                                                                            } else {
                                                                                                                z13 = g3Var.f11146d.get(iZzb);
                                                                                                            }
                                                                                                            i11 = iIntValue2;
                                                                                                            nVar = nVar3;
                                                                                                            zA = h3Var2.a(l13, l14, zzftVarC, nVar3.f11264c, nVar, z13);
                                                                                                            if (zA) {
                                                                                                                this.e.add(num3);
                                                                                                                r29 = r210;
                                                                                                                break;
                                                                                                            }
                                                                                                            h(num3).b(h3Var2);
                                                                                                            iIntValue2 = i11;
                                                                                                            num6 = num3;
                                                                                                            lVar = lVar2;
                                                                                                            map7 = map8;
                                                                                                            r12 = r210;
                                                                                                        }
                                                                                                        if (!zA) {
                                                                                                            this.e.add(num3);
                                                                                                        }
                                                                                                        lVar = lVar2;
                                                                                                        map7 = map8;
                                                                                                        eVar7 = r29;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (!list2.isEmpty()) {
                                                                                        eVar5 = new r.e();
                                                                                        it4 = list2.iterator();
                                                                                        while (it4.hasNext()) {
                                                                                            zzgm zzgmVar = (zzgm) it4.next();
                                                                                            strZzf = zzgmVar.zzf();
                                                                                            map5 = (Map) eVar5.get(strZzf);
                                                                                            if (map5 == null) {
                                                                                                j jVarG8 = z2Var.G();
                                                                                                a1Var6 = (a1) jVarG8.f159a;
                                                                                                str11 = this.f11020d;
                                                                                                jVarG8.d();
                                                                                                jVarG8.c();
                                                                                                com.google.android.gms.common.internal.i0.e(str11);
                                                                                                com.google.android.gms.common.internal.i0.e(strZzf);
                                                                                                eVar6 = new r.e();
                                                                                                try {
                                                                                                    cursorQuery2 = jVarG8.v().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzf}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                                str10 = str7;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            zzet zzetVar2 = (zzet) ((zzes) l0.B(zzet.zzc(), cursorQuery2.getBlob(1))).zzaD();
                                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                            list5 = (List) eVar6.get(numValueOf5);
                                                                                                                            if (list5 == null) {
                                                                                                                                a1Var7 = a1Var6;
                                                                                                                                try {
                                                                                                                                    arrayList3 = new ArrayList();
                                                                                                                                    eVar6.put(numValueOf5, arrayList3);
                                                                                                                                } catch (SQLiteException e21) {
                                                                                                                                    e = e21;
                                                                                                                                    str12 = str11;
                                                                                                                                    a1Var7.zzaA().g().d(i0.k(str12), str22, e);
                                                                                                                                    map5 = Collections.EMPTY_MAP;
                                                                                                                                    if (cursorQuery2 != null) {
                                                                                                                                        cursorQuery2.close();
                                                                                                                                    }
                                                                                                                                    eVar5.put(strZzf, map5);
                                                                                                                                    map6 = map5;
                                                                                                                                    for (Integer num7 : map6.keySet()) {
                                                                                                                                        iIntValue = num7.intValue();
                                                                                                                                        if (this.e.contains(num7)) {
                                                                                                                                            a1Var3.zzaA().h().c(num7, str8);
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        it5 = ((List) map6.get(num7)).iterator();
                                                                                                                                        zB = true;
                                                                                                                                        while (true) {
                                                                                                                                            if (it5.hasNext()) {
                                                                                                                                                zzetVar = (zzet) it5.next();
                                                                                                                                                if (Log.isLoggable(a1Var3.zzaA().o(), 2)) {
                                                                                                                                                    fd.b bVarH = a1Var3.zzaA().h();
                                                                                                                                                    if (zzetVar.zzj()) {
                                                                                                                                                        numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                                                                                                    } else {
                                                                                                                                                        numValueOf4 = null;
                                                                                                                                                    }
                                                                                                                                                    bVarH.e("Evaluating filter. audience, filter, property", num7, numValueOf4, a1Var3.l().f(zzetVar.zze()));
                                                                                                                                                    a1Var3.zzaA().h().c(z2Var.K().D(zzetVar), "Filter definition");
                                                                                                                                                }
                                                                                                                                                if (zzetVar.zzj()) {
                                                                                                                                                }
                                                                                                                                                num2 = num7;
                                                                                                                                                fd.b bVarJ = a1Var3.zzaA().j();
                                                                                                                                                h0 h0VarK = i0.k(this.f11020d);
                                                                                                                                                if (zzetVar.zzj()) {
                                                                                                                                                    numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                                                                                                } else {
                                                                                                                                                    numValueOf3 = null;
                                                                                                                                                }
                                                                                                                                                bVarJ.d(h0VarK, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
                                                                                                                                                this.e.add(num2);
                                                                                                                                                str8 = str8;
                                                                                                                                            } else {
                                                                                                                                                str8 = str8;
                                                                                                                                                num2 = num7;
                                                                                                                                            }
                                                                                                                                            if (!zB) {
                                                                                                                                                this.e.add(num2);
                                                                                                                                            }
                                                                                                                                            str8 = str8;
                                                                                                                                            h(num2).b(h3Var);
                                                                                                                                            iIntValue = iIntValue;
                                                                                                                                            num7 = num2;
                                                                                                                                            str8 = str8;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    str7 = str10;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                a1Var7 = a1Var6;
                                                                                                                                arrayList3 = list5;
                                                                                                                            }
                                                                                                                            arrayList3.add(zzetVar2);
                                                                                                                            str12 = str11;
                                                                                                                        } catch (IOException e22) {
                                                                                                                            a1Var7 = a1Var6;
                                                                                                                            str12 = str11;
                                                                                                                            a1Var7.zzaA().g().d(i0.k(str12), "Failed to merge filter", e22);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (!cursorQuery2.moveToNext()) {
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            a1Var6 = a1Var7;
                                                                                                                            str11 = str12;
                                                                                                                        } catch (SQLiteException e23) {
                                                                                                                            e = e23;
                                                                                                                            a1Var7.zzaA().g().d(i0.k(str12), str22, e);
                                                                                                                            map5 = Collections.EMPTY_MAP;
                                                                                                                            if (cursorQuery2 != null) {
                                                                                                                                cursorQuery2.close();
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e24) {
                                                                                                                        e = e24;
                                                                                                                        a1Var7 = a1Var6;
                                                                                                                    }
                                                                                                                }
                                                                                                                cursorQuery2.close();
                                                                                                                map5 = eVar6;
                                                                                                            } else {
                                                                                                                str10 = str7;
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                cursorQuery2.close();
                                                                                                            }
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            cursor = cursorQuery2;
                                                                                                            if (cursor != null) {
                                                                                                                cursor.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e25) {
                                                                                                        e = e25;
                                                                                                        a1Var7 = a1Var6;
                                                                                                        str12 = str11;
                                                                                                        str10 = str7;
                                                                                                    }
                                                                                                } catch (SQLiteException e26) {
                                                                                                    e = e26;
                                                                                                    a1Var7 = a1Var6;
                                                                                                    str12 = str11;
                                                                                                    str10 = str7;
                                                                                                    cursorQuery2 = null;
                                                                                                } catch (Throwable th5) {
                                                                                                    th = th5;
                                                                                                    cursor = null;
                                                                                                }
                                                                                                eVar5.put(strZzf, map5);
                                                                                            } else {
                                                                                                str10 = str7;
                                                                                            }
                                                                                            map6 = map5;
                                                                                            while (r15.hasNext()) {
                                                                                                iIntValue = num7.intValue();
                                                                                                if (this.e.contains(num7)) {
                                                                                                    a1Var3.zzaA().h().c(num7, str8);
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                it5 = ((List) map6.get(num7)).iterator();
                                                                                                zB = true;
                                                                                                while (true) {
                                                                                                    if (it5.hasNext()) {
                                                                                                        zzetVar = (zzet) it5.next();
                                                                                                        if (Log.isLoggable(a1Var3.zzaA().o(), 2)) {
                                                                                                            fd.b bVarH2 = a1Var3.zzaA().h();
                                                                                                            if (zzetVar.zzj()) {
                                                                                                                numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                                                            } else {
                                                                                                                numValueOf4 = null;
                                                                                                            }
                                                                                                            bVarH2.e("Evaluating filter. audience, filter, property", num7, numValueOf4, a1Var3.l().f(zzetVar.zze()));
                                                                                                            a1Var3.zzaA().h().c(z2Var.K().D(zzetVar), "Filter definition");
                                                                                                        }
                                                                                                        if (zzetVar.zzj()) {
                                                                                                        }
                                                                                                        num2 = num7;
                                                                                                        fd.b bVarJ2 = a1Var3.zzaA().j();
                                                                                                        h0 h0VarK2 = i0.k(this.f11020d);
                                                                                                        if (zzetVar.zzj()) {
                                                                                                            numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                                                        } else {
                                                                                                            numValueOf3 = null;
                                                                                                        }
                                                                                                        bVarJ2.d(h0VarK2, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
                                                                                                        this.e.add(num2);
                                                                                                        str8 = str8;
                                                                                                    } else {
                                                                                                        str8 = str8;
                                                                                                        num2 = num7;
                                                                                                    }
                                                                                                    if (!zB) {
                                                                                                        this.e.add(num2);
                                                                                                    }
                                                                                                    str8 = str8;
                                                                                                    h(num2).b(h3Var);
                                                                                                    iIntValue = iIntValue;
                                                                                                    num7 = num2;
                                                                                                    str8 = str8;
                                                                                                }
                                                                                            }
                                                                                            str7 = str10;
                                                                                        }
                                                                                    }
                                                                                    arrayList2 = new ArrayList();
                                                                                    r.b<Integer> bVar = (r.b) this.f11021f.keySet();
                                                                                    bVar.removeAll(this.e);
                                                                                    for (Integer num8 : bVar) {
                                                                                        int iIntValue3 = num8.intValue();
                                                                                        g3 g3Var2 = (g3) this.f11021f.get(num8);
                                                                                        com.google.android.gms.common.internal.i0.i(g3Var2);
                                                                                        zzfp zzfpVarA = g3Var2.a(iIntValue3);
                                                                                        arrayList2.add(zzfpVarA);
                                                                                        jVarG2 = z2Var.G();
                                                                                        a1Var5 = (a1) jVarG2.f159a;
                                                                                        str9 = this.f11020d;
                                                                                        zzgi zzgiVarZzd = zzfpVarA.zzd();
                                                                                        jVarG2.d();
                                                                                        jVarG2.c();
                                                                                        com.google.android.gms.common.internal.i0.e(str9);
                                                                                        com.google.android.gms.common.internal.i0.i(zzgiVarZzd);
                                                                                        byte[] bArrZzbx = zzgiVarZzd.zzbx();
                                                                                        contentValues = new ContentValues();
                                                                                        contentValues.put("app_id", str9);
                                                                                        contentValues.put(str5, num8);
                                                                                        contentValues.put("current_results", bArrZzbx);
                                                                                        try {
                                                                                            try {
                                                                                                if (jVarG2.v().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                    a1Var5.zzaA().g().c(i0.k(str9), "Failed to insert filter results (got -1). appId");
                                                                                                }
                                                                                            } catch (SQLiteException e27) {
                                                                                                e = e27;
                                                                                                a1Var5.zzaA().g().d(i0.k(str9), "Error storing filter results. appId", e);
                                                                                            }
                                                                                        } catch (SQLiteException e28) {
                                                                                            e = e28;
                                                                                        }
                                                                                    }
                                                                                    return arrayList2;
                                                                                }
                                                                            } catch (SQLiteException e29) {
                                                                                e = e29;
                                                                                cursorRawQuery = null;
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                r10 = 0;
                                                                                if (r10 != 0) {
                                                                                    r10.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                            cursorRawQuery.close();
                                                                            r11 = eVar3;
                                                                            com.google.android.gms.common.internal.i0.e(str21);
                                                                            eVar4 = new r.e();
                                                                            if (!map2.isEmpty()) {
                                                                                it2 = map2.keySet().iterator();
                                                                                while (it2.hasNext()) {
                                                                                    num = (Integer) it2.next();
                                                                                    num.getClass();
                                                                                    zzgiVar3 = (zzgi) map2.get(num);
                                                                                    list4 = (List) r11.get(num);
                                                                                    if (list4 != null) {
                                                                                    }
                                                                                    r17 = r11;
                                                                                    it3 = it2;
                                                                                    a1Var4 = a1Var11;
                                                                                    eVar4.put(num, zzgiVar3);
                                                                                    r11 = r17;
                                                                                    it2 = it3;
                                                                                    str19 = str19;
                                                                                    a1Var11 = a1Var4;
                                                                                }
                                                                            }
                                                                            str4 = str19;
                                                                            a1Var3 = a1Var11;
                                                                            map3 = eVar4;
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                            r10 = hashSet;
                                                                        }
                                                                    } else {
                                                                        str4 = "audience_id";
                                                                        a1Var3 = a1Var11;
                                                                        map3 = map2;
                                                                    }
                                                                    map4 = map;
                                                                    while (r16.hasNext()) {
                                                                        num4.getClass();
                                                                        zzgiVar = (zzgi) map3.get(num4);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        eVar = new r.e();
                                                                        if (zzgiVar != null) {
                                                                            while (r3.hasNext()) {
                                                                                if (zzfrVar.zzh()) {
                                                                                    zzgi zzgiVar6 = zzgiVar;
                                                                                    Integer numValueOf9 = Integer.valueOf(zzfrVar.zza());
                                                                                    if (zzfrVar.zzg()) {
                                                                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    eVar.put(numValueOf9, lValueOf);
                                                                                    zzgiVar = zzgiVar6;
                                                                                }
                                                                            }
                                                                        }
                                                                        zzgiVar2 = zzgiVar;
                                                                        eVar2 = new r.e();
                                                                        if (zzgiVar2 != null) {
                                                                            it = zzgiVar2.zzj().iterator();
                                                                            while (it.hasNext()) {
                                                                                zzgkVar = (zzgk) it.next();
                                                                                if (!zzgkVar.zzi()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        if (zzgiVar2 != null) {
                                                                            i = 0;
                                                                            while (i < zzgiVar2.zzd() * 64) {
                                                                                if (l0.J(i, zzgiVar2.zzk())) {
                                                                                    z11 = zL;
                                                                                    a1Var3.zzaA().h().d(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
                                                                                    bitSet2.set(i);
                                                                                    if (l0.J(i, zzgiVar2.zzi())) {
                                                                                        bitSet.set(i);
                                                                                    }
                                                                                    i++;
                                                                                    zL = z11;
                                                                                } else {
                                                                                    z11 = zL;
                                                                                }
                                                                                eVar.remove(Integer.valueOf(i));
                                                                                i++;
                                                                                zL = z11;
                                                                            }
                                                                        }
                                                                        boolean z15 = zL;
                                                                        zzgi zzgiVar7 = (zzgi) map2.get(num4);
                                                                        if (zL2) {
                                                                            while (r2.hasNext()) {
                                                                                int iZzb3 = zzekVar2.zzb();
                                                                                Integer num9 = num4;
                                                                                jLongValue = this.f11023s.longValue() / 1000;
                                                                                if (zzekVar2.zzm()) {
                                                                                    jLongValue = this.f11022r.longValue() / 1000;
                                                                                }
                                                                                numValueOf = Integer.valueOf(iZzb3);
                                                                                if (eVar.containsKey(numValueOf)) {
                                                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                }
                                                                                if (eVar2.containsKey(numValueOf)) {
                                                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                }
                                                                                num4 = num9;
                                                                            }
                                                                        }
                                                                        this.f11021f.put(num4, new g3(this, this.f11020d, zzgiVar7, bitSet, bitSet2, eVar, eVar2));
                                                                        str18 = str18;
                                                                        map2 = map2;
                                                                        zL = z15;
                                                                        map4 = map4;
                                                                        map3 = map12;
                                                                    }
                                                                    str5 = str4;
                                                                }
                                                                str7 = str18;
                                                                String str23 = str3;
                                                                str8 = "Skipping failed audience ID";
                                                                if (!list.isEmpty()) {
                                                                    lVar = new fd.l(this);
                                                                    eVar7 = new r.e();
                                                                    it6 = list.iterator();
                                                                    while (it6.hasNext()) {
                                                                        zzftVar = (zzft) it6.next();
                                                                        zzftVarC = lVar.c(zzftVar, this.f11020d);
                                                                        if (zzftVarC != null) {
                                                                            j jVarG9 = z2Var.G();
                                                                            a1Var8 = (a1) jVarG9.f159a;
                                                                            str13 = this.f11020d;
                                                                            strZzh = zzftVarC.zzh();
                                                                            nVarZ = jVarG9.z(str13, zzftVar.zzh());
                                                                            if (nVarZ == null) {
                                                                                a1Var8.zzaA().j().d(i0.k(str13), "Event aggregate wasn't created during raw event logging. appId, event", a1Var8.l().d(strZzh));
                                                                                nVar = new n(str13, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                                            } else {
                                                                                nVar = new n(nVarZ.f11262a, nVarZ.f11263b, nVarZ.f11264c + 1, nVarZ.f11265d + 1, nVarZ.e + 1, nVarZ.f11266f, nVarZ.f11267g, nVarZ.h, nVarZ.i, nVarZ.f11268j, nVarZ.f11269k);
                                                                            }
                                                                            z2Var.G().k(nVar);
                                                                            strZzh2 = zzftVarC.zzh();
                                                                            map7 = (Map) eVar7.get(strZzh2);
                                                                            if (map7 == null) {
                                                                                j jVarG10 = z2Var.G();
                                                                                a1Var9 = (a1) jVarG10.f159a;
                                                                                str14 = this.f11020d;
                                                                                jVarG10.d();
                                                                                jVarG10.c();
                                                                                com.google.android.gms.common.internal.i0.e(str14);
                                                                                com.google.android.gms.common.internal.i0.e(strZzh2);
                                                                                eVar8 = new r.e();
                                                                                a1Var10 = a1Var9;
                                                                                cursorQuery3 = jVarG10.v().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str14, strZzh2}, null, null, null);
                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                    str15 = str14;
                                                                                    while (true) {
                                                                                        zzek zzekVar6 = (zzek) ((zzej) l0.B(zzek.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                        list6 = (List) eVar8.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            cursor3 = cursorQuery3;
                                                                                            arrayList4 = new ArrayList();
                                                                                            eVar8.put(numValueOf6, arrayList4);
                                                                                        } else {
                                                                                            cursor3 = cursorQuery3;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(zzekVar6);
                                                                                        if (!cursor3.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        cursorQuery3 = cursor3;
                                                                                    }
                                                                                    cursor3.close();
                                                                                    map7 = eVar8;
                                                                                } else {
                                                                                    cursor3 = cursorQuery3;
                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                    cursor3.close();
                                                                                }
                                                                                eVar7.put(strZzh2, map7);
                                                                            }
                                                                            while (r25.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.e.contains(num6)) {
                                                                                    a1Var3.zzaA().h().c(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it7 = ((List) map7.get(num6)).iterator();
                                                                                    zA = true;
                                                                                    r12 = eVar7;
                                                                                    while (true) {
                                                                                        if (it7.hasNext()) {
                                                                                            map8 = map7;
                                                                                            lVar2 = lVar;
                                                                                            r29 = r12;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        zzek zzekVar7 = (zzek) it7.next();
                                                                                        map8 = map7;
                                                                                        lVar2 = lVar;
                                                                                        r210 = r12;
                                                                                        num3 = num6;
                                                                                        n nVar4 = nVar;
                                                                                        h3Var2 = new h3(this, this.f11020d, iIntValue2, zzekVar7, 0);
                                                                                        Long l15 = this.f11022r;
                                                                                        Long l16 = this.f11023s;
                                                                                        iZzb = zzekVar7.zzb();
                                                                                        g3Var = (g3) this.f11021f.get(num3);
                                                                                        if (g3Var == null) {
                                                                                            z13 = false;
                                                                                        } else {
                                                                                            z13 = g3Var.f11146d.get(iZzb);
                                                                                        }
                                                                                        i11 = iIntValue2;
                                                                                        nVar = nVar4;
                                                                                        zA = h3Var2.a(l15, l16, zzftVarC, nVar4.f11264c, nVar, z13);
                                                                                        if (zA) {
                                                                                            this.e.add(num3);
                                                                                            r29 = r210;
                                                                                            break;
                                                                                        }
                                                                                        h(num3).b(h3Var2);
                                                                                        iIntValue2 = i11;
                                                                                        num6 = num3;
                                                                                        lVar = lVar2;
                                                                                        map7 = map8;
                                                                                        r12 = r210;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.e.add(num3);
                                                                                    }
                                                                                    lVar = lVar2;
                                                                                    map7 = map8;
                                                                                    eVar7 = r29;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (!list2.isEmpty()) {
                                                                    eVar5 = new r.e();
                                                                    it4 = list2.iterator();
                                                                    while (it4.hasNext()) {
                                                                        zzgm zzgmVar2 = (zzgm) it4.next();
                                                                        strZzf = zzgmVar2.zzf();
                                                                        map5 = (Map) eVar5.get(strZzf);
                                                                        if (map5 == null) {
                                                                            j jVarG11 = z2Var.G();
                                                                            a1Var6 = (a1) jVarG11.f159a;
                                                                            str11 = this.f11020d;
                                                                            jVarG11.d();
                                                                            jVarG11.c();
                                                                            com.google.android.gms.common.internal.i0.e(str11);
                                                                            com.google.android.gms.common.internal.i0.e(strZzf);
                                                                            eVar6 = new r.e();
                                                                            cursorQuery2 = jVarG11.v().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzf}, null, null, null);
                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                str10 = str7;
                                                                                while (true) {
                                                                                    zzet zzetVar3 = (zzet) ((zzes) l0.B(zzet.zzc(), cursorQuery2.getBlob(1))).zzaD();
                                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                    list5 = (List) eVar6.get(numValueOf5);
                                                                                    if (list5 == null) {
                                                                                        a1Var7 = a1Var6;
                                                                                        arrayList3 = new ArrayList();
                                                                                        eVar6.put(numValueOf5, arrayList3);
                                                                                    } else {
                                                                                        a1Var7 = a1Var6;
                                                                                        arrayList3 = list5;
                                                                                    }
                                                                                    arrayList3.add(zzetVar3);
                                                                                    str12 = str11;
                                                                                    if (!cursorQuery2.moveToNext()) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    a1Var6 = a1Var7;
                                                                                    str11 = str12;
                                                                                }
                                                                                cursorQuery2.close();
                                                                                map5 = eVar6;
                                                                            } else {
                                                                                str10 = str7;
                                                                                map5 = Collections.EMPTY_MAP;
                                                                                cursorQuery2.close();
                                                                            }
                                                                            eVar5.put(strZzf, map5);
                                                                        } else {
                                                                            str10 = str7;
                                                                        }
                                                                        map6 = map5;
                                                                        while (r15.hasNext()) {
                                                                            iIntValue = num7.intValue();
                                                                            if (this.e.contains(num7)) {
                                                                                a1Var3.zzaA().h().c(num7, str8);
                                                                                break;
                                                                                break;
                                                                            }
                                                                            it5 = ((List) map6.get(num7)).iterator();
                                                                            zB = true;
                                                                            while (true) {
                                                                                if (it5.hasNext()) {
                                                                                    zzetVar = (zzet) it5.next();
                                                                                    if (Log.isLoggable(a1Var3.zzaA().o(), 2)) {
                                                                                        fd.b bVarH3 = a1Var3.zzaA().h();
                                                                                        if (zzetVar.zzj()) {
                                                                                            numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                                        } else {
                                                                                            numValueOf4 = null;
                                                                                        }
                                                                                        bVarH3.e("Evaluating filter. audience, filter, property", num7, numValueOf4, a1Var3.l().f(zzetVar.zze()));
                                                                                        a1Var3.zzaA().h().c(z2Var.K().D(zzetVar), "Filter definition");
                                                                                    }
                                                                                    if (zzetVar.zzj()) {
                                                                                    }
                                                                                    num2 = num7;
                                                                                    fd.b bVarJ3 = a1Var3.zzaA().j();
                                                                                    h0 h0VarK3 = i0.k(this.f11020d);
                                                                                    if (zzetVar.zzj()) {
                                                                                        numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                                    } else {
                                                                                        numValueOf3 = null;
                                                                                    }
                                                                                    bVarJ3.d(h0VarK3, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
                                                                                    this.e.add(num2);
                                                                                    str8 = str8;
                                                                                } else {
                                                                                    str8 = str8;
                                                                                    num2 = num7;
                                                                                }
                                                                                if (!zB) {
                                                                                    this.e.add(num2);
                                                                                }
                                                                                str8 = str8;
                                                                                h(num2).b(h3Var);
                                                                                iIntValue = iIntValue;
                                                                                num7 = num2;
                                                                                str8 = str8;
                                                                            }
                                                                        }
                                                                        str7 = str10;
                                                                    }
                                                                }
                                                                arrayList2 = new ArrayList();
                                                                r.b<Integer> bVar2 = (r.b) this.f11021f.keySet();
                                                                bVar2.removeAll(this.e);
                                                                while (r3.hasNext()) {
                                                                    int iIntValue4 = num8.intValue();
                                                                    g3 g3Var3 = (g3) this.f11021f.get(num8);
                                                                    com.google.android.gms.common.internal.i0.i(g3Var3);
                                                                    zzfp zzfpVarA2 = g3Var3.a(iIntValue4);
                                                                    arrayList2.add(zzfpVarA2);
                                                                    jVarG2 = z2Var.G();
                                                                    a1Var5 = (a1) jVarG2.f159a;
                                                                    str9 = this.f11020d;
                                                                    zzgi zzgiVarZzd2 = zzfpVarA2.zzd();
                                                                    jVarG2.d();
                                                                    jVarG2.c();
                                                                    com.google.android.gms.common.internal.i0.e(str9);
                                                                    com.google.android.gms.common.internal.i0.i(zzgiVarZzd2);
                                                                    byte[] bArrZzbx2 = zzgiVarZzd2.zzbx();
                                                                    contentValues = new ContentValues();
                                                                    contentValues.put("app_id", str9);
                                                                    contentValues.put(str5, num8);
                                                                    contentValues.put("current_results", bArrZzbx2);
                                                                    if (jVarG2.v().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                        a1Var5.zzaA().g().c(i0.k(str9), "Failed to insert filter results (got -1). appId");
                                                                    }
                                                                }
                                                                return arrayList2;
                                                            }
                                                        }
                                                        try {
                                                            if (!cursorQuery.moveToNext()) {
                                                                break;
                                                            }
                                                            a1Var = a1Var2;
                                                            str17 = str3;
                                                            str2 = str2;
                                                        } catch (SQLiteException e30) {
                                                            e = e30;
                                                            a1Var2.zzaA().g().d(i0.k(str2), "Database error querying filter results. appId", e);
                                                            Map map13 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map13;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    map2 = eVar9;
                                                } else {
                                                    Map map14 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map14;
                                                    str3 = "Database error querying filters. appId";
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    a1Var3 = a1Var11;
                                                } else {
                                                    HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                    if (z10) {
                                                        String str24 = this.f11020d;
                                                        jVarG = z2Var.G();
                                                        str6 = this.f11020d;
                                                        jVarG.d();
                                                        jVarG.c();
                                                        com.google.android.gms.common.internal.i0.e(str6);
                                                        eVar3 = new r.e();
                                                        cursorRawQuery = jVarG.v().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    eVar3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            eVar3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r11 = eVar3;
                                                        com.google.android.gms.common.internal.i0.e(str24);
                                                        eVar4 = new r.e();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                zzgiVar3 = (zzgi) map2.get(num);
                                                                list4 = (List) r11.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r17 = r11;
                                                                it3 = it2;
                                                                a1Var4 = a1Var11;
                                                                eVar4.put(num, zzgiVar3);
                                                                r11 = r17;
                                                                it2 = it3;
                                                                str19 = str19;
                                                                a1Var11 = a1Var4;
                                                            }
                                                        }
                                                        str4 = str19;
                                                        a1Var3 = a1Var11;
                                                        map3 = eVar4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        a1Var3 = a1Var11;
                                                        map3 = map2;
                                                    }
                                                    map4 = map;
                                                    while (r16.hasNext()) {
                                                        num4.getClass();
                                                        zzgiVar = (zzgi) map3.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        eVar = new r.e();
                                                        if (zzgiVar != null) {
                                                            while (r3.hasNext()) {
                                                                if (zzfrVar.zzh()) {
                                                                    zzgi zzgiVar8 = zzgiVar;
                                                                    Integer numValueOf10 = Integer.valueOf(zzfrVar.zza());
                                                                    if (zzfrVar.zzg()) {
                                                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    eVar.put(numValueOf10, lValueOf);
                                                                    zzgiVar = zzgiVar8;
                                                                }
                                                            }
                                                        }
                                                        zzgiVar2 = zzgiVar;
                                                        eVar2 = new r.e();
                                                        if (zzgiVar2 != null) {
                                                            it = zzgiVar2.zzj().iterator();
                                                            while (it.hasNext()) {
                                                                zzgkVar = (zzgk) it.next();
                                                                if (!zzgkVar.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        Map map15 = map3;
                                                        if (zzgiVar2 != null) {
                                                            i = 0;
                                                            while (i < zzgiVar2.zzd() * 64) {
                                                                if (l0.J(i, zzgiVar2.zzk())) {
                                                                    z11 = zL;
                                                                    a1Var3.zzaA().h().d(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
                                                                    bitSet2.set(i);
                                                                    if (l0.J(i, zzgiVar2.zzi())) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zL = z11;
                                                                } else {
                                                                    z11 = zL;
                                                                }
                                                                eVar.remove(Integer.valueOf(i));
                                                                i++;
                                                                zL = z11;
                                                            }
                                                        }
                                                        boolean z16 = zL;
                                                        zzgi zzgiVar9 = (zzgi) map2.get(num4);
                                                        if (zL2) {
                                                            while (r2.hasNext()) {
                                                                int iZzb4 = zzekVar2.zzb();
                                                                Integer num10 = num4;
                                                                jLongValue = this.f11023s.longValue() / 1000;
                                                                if (zzekVar2.zzm()) {
                                                                    jLongValue = this.f11022r.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iZzb4);
                                                                if (eVar.containsKey(numValueOf)) {
                                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (eVar2.containsKey(numValueOf)) {
                                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f11021f.put(num4, new g3(this, this.f11020d, zzgiVar9, bitSet, bitSet2, eVar, eVar2));
                                                        str18 = str18;
                                                        map2 = map2;
                                                        zL = z16;
                                                        map4 = map4;
                                                        map3 = map15;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str18;
                                                String str25 = str3;
                                                str8 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    lVar = new fd.l(this);
                                                    eVar7 = new r.e();
                                                    it6 = list.iterator();
                                                    while (it6.hasNext()) {
                                                        zzftVar = (zzft) it6.next();
                                                        zzftVarC = lVar.c(zzftVar, this.f11020d);
                                                        if (zzftVarC != null) {
                                                            j jVarG12 = z2Var.G();
                                                            a1Var8 = (a1) jVarG12.f159a;
                                                            str13 = this.f11020d;
                                                            strZzh = zzftVarC.zzh();
                                                            nVarZ = jVarG12.z(str13, zzftVar.zzh());
                                                            if (nVarZ == null) {
                                                                a1Var8.zzaA().j().d(i0.k(str13), "Event aggregate wasn't created during raw event logging. appId, event", a1Var8.l().d(strZzh));
                                                                nVar = new n(str13, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                nVar = new n(nVarZ.f11262a, nVarZ.f11263b, nVarZ.f11264c + 1, nVarZ.f11265d + 1, nVarZ.e + 1, nVarZ.f11266f, nVarZ.f11267g, nVarZ.h, nVarZ.i, nVarZ.f11268j, nVarZ.f11269k);
                                                            }
                                                            z2Var.G().k(nVar);
                                                            strZzh2 = zzftVarC.zzh();
                                                            map7 = (Map) eVar7.get(strZzh2);
                                                            if (map7 == null) {
                                                                j jVarG13 = z2Var.G();
                                                                a1Var9 = (a1) jVarG13.f159a;
                                                                str14 = this.f11020d;
                                                                jVarG13.d();
                                                                jVarG13.c();
                                                                com.google.android.gms.common.internal.i0.e(str14);
                                                                com.google.android.gms.common.internal.i0.e(strZzh2);
                                                                eVar8 = new r.e();
                                                                a1Var10 = a1Var9;
                                                                cursorQuery3 = jVarG13.v().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str14, strZzh2}, null, null, null);
                                                                if (cursorQuery3.moveToFirst()) {
                                                                    str15 = str14;
                                                                    while (true) {
                                                                        zzek zzekVar8 = (zzek) ((zzej) l0.B(zzek.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                        list6 = (List) eVar8.get(numValueOf6);
                                                                        if (list6 == null) {
                                                                            cursor3 = cursorQuery3;
                                                                            arrayList4 = new ArrayList();
                                                                            eVar8.put(numValueOf6, arrayList4);
                                                                        } else {
                                                                            cursor3 = cursorQuery3;
                                                                            arrayList4 = list6;
                                                                        }
                                                                        arrayList4.add(zzekVar8);
                                                                        if (!cursor3.moveToNext()) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        cursorQuery3 = cursor3;
                                                                    }
                                                                    cursor3.close();
                                                                    map7 = eVar8;
                                                                } else {
                                                                    cursor3 = cursorQuery3;
                                                                    map7 = Collections.EMPTY_MAP;
                                                                    cursor3.close();
                                                                }
                                                                eVar7.put(strZzh2, map7);
                                                            }
                                                            while (r25.hasNext()) {
                                                                iIntValue2 = num6.intValue();
                                                                if (this.e.contains(num6)) {
                                                                    a1Var3.zzaA().h().c(num6, "Skipping failed audience ID");
                                                                } else {
                                                                    it7 = ((List) map7.get(num6)).iterator();
                                                                    zA = true;
                                                                    r12 = eVar7;
                                                                    while (true) {
                                                                        if (it7.hasNext()) {
                                                                            map8 = map7;
                                                                            lVar2 = lVar;
                                                                            r29 = r12;
                                                                            num3 = num6;
                                                                            break;
                                                                        }
                                                                        zzek zzekVar9 = (zzek) it7.next();
                                                                        map8 = map7;
                                                                        lVar2 = lVar;
                                                                        r210 = r12;
                                                                        num3 = num6;
                                                                        n nVar5 = nVar;
                                                                        h3Var2 = new h3(this, this.f11020d, iIntValue2, zzekVar9, 0);
                                                                        Long l17 = this.f11022r;
                                                                        Long l18 = this.f11023s;
                                                                        iZzb = zzekVar9.zzb();
                                                                        g3Var = (g3) this.f11021f.get(num3);
                                                                        if (g3Var == null) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = g3Var.f11146d.get(iZzb);
                                                                        }
                                                                        i11 = iIntValue2;
                                                                        nVar = nVar5;
                                                                        zA = h3Var2.a(l17, l18, zzftVarC, nVar5.f11264c, nVar, z13);
                                                                        if (zA) {
                                                                            this.e.add(num3);
                                                                            r29 = r210;
                                                                            break;
                                                                        }
                                                                        h(num3).b(h3Var2);
                                                                        iIntValue2 = i11;
                                                                        num6 = num3;
                                                                        lVar = lVar2;
                                                                        map7 = map8;
                                                                        r12 = r210;
                                                                    }
                                                                    if (!zA) {
                                                                        this.e.add(num3);
                                                                    }
                                                                    lVar = lVar2;
                                                                    map7 = map8;
                                                                    eVar7 = r29;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!list2.isEmpty()) {
                                                    eVar5 = new r.e();
                                                    it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        zzgm zzgmVar3 = (zzgm) it4.next();
                                                        strZzf = zzgmVar3.zzf();
                                                        map5 = (Map) eVar5.get(strZzf);
                                                        if (map5 == null) {
                                                            j jVarG14 = z2Var.G();
                                                            a1Var6 = (a1) jVarG14.f159a;
                                                            str11 = this.f11020d;
                                                            jVarG14.d();
                                                            jVarG14.c();
                                                            com.google.android.gms.common.internal.i0.e(str11);
                                                            com.google.android.gms.common.internal.i0.e(strZzf);
                                                            eVar6 = new r.e();
                                                            cursorQuery2 = jVarG14.v().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzf}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                str10 = str7;
                                                                while (true) {
                                                                    zzet zzetVar4 = (zzet) ((zzes) l0.B(zzet.zzc(), cursorQuery2.getBlob(1))).zzaD();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) eVar6.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        a1Var7 = a1Var6;
                                                                        arrayList3 = new ArrayList();
                                                                        eVar6.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        a1Var7 = a1Var6;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(zzetVar4);
                                                                    str12 = str11;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    a1Var6 = a1Var7;
                                                                    str11 = str12;
                                                                }
                                                                cursorQuery2.close();
                                                                map5 = eVar6;
                                                            } else {
                                                                str10 = str7;
                                                                map5 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            eVar5.put(strZzf, map5);
                                                        } else {
                                                            str10 = str7;
                                                        }
                                                        map6 = map5;
                                                        while (r15.hasNext()) {
                                                            iIntValue = num7.intValue();
                                                            if (this.e.contains(num7)) {
                                                                a1Var3.zzaA().h().c(num7, str8);
                                                                break;
                                                                break;
                                                            }
                                                            it5 = ((List) map6.get(num7)).iterator();
                                                            zB = true;
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    zzetVar = (zzet) it5.next();
                                                                    if (Log.isLoggable(a1Var3.zzaA().o(), 2)) {
                                                                        fd.b bVarH4 = a1Var3.zzaA().h();
                                                                        if (zzetVar.zzj()) {
                                                                            numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        bVarH4.e("Evaluating filter. audience, filter, property", num7, numValueOf4, a1Var3.l().f(zzetVar.zze()));
                                                                        a1Var3.zzaA().h().c(z2Var.K().D(zzetVar), "Filter definition");
                                                                    }
                                                                    if (zzetVar.zzj()) {
                                                                    }
                                                                    num2 = num7;
                                                                    fd.b bVarJ4 = a1Var3.zzaA().j();
                                                                    h0 h0VarK4 = i0.k(this.f11020d);
                                                                    if (zzetVar.zzj()) {
                                                                        numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    bVarJ4.d(h0VarK4, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
                                                                    this.e.add(num2);
                                                                    str8 = str8;
                                                                } else {
                                                                    str8 = str8;
                                                                    num2 = num7;
                                                                }
                                                                if (!zB) {
                                                                    this.e.add(num2);
                                                                }
                                                                str8 = str8;
                                                                h(num2).b(h3Var);
                                                                iIntValue = iIntValue;
                                                                num7 = num2;
                                                                str8 = str8;
                                                            }
                                                        }
                                                        str7 = str10;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                r.b<Integer> bVar3 = (r.b) this.f11021f.keySet();
                                                bVar3.removeAll(this.e);
                                                while (r3.hasNext()) {
                                                    int iIntValue5 = num8.intValue();
                                                    g3 g3Var4 = (g3) this.f11021f.get(num8);
                                                    com.google.android.gms.common.internal.i0.i(g3Var4);
                                                    zzfp zzfpVarA3 = g3Var4.a(iIntValue5);
                                                    arrayList2.add(zzfpVarA3);
                                                    jVarG2 = z2Var.G();
                                                    a1Var5 = (a1) jVarG2.f159a;
                                                    str9 = this.f11020d;
                                                    zzgi zzgiVarZzd3 = zzfpVarA3.zzd();
                                                    jVarG2.d();
                                                    jVarG2.c();
                                                    com.google.android.gms.common.internal.i0.e(str9);
                                                    com.google.android.gms.common.internal.i0.i(zzgiVarZzd3);
                                                    byte[] bArrZzbx3 = zzgiVarZzd3.zzbx();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str9);
                                                    contentValues.put(str5, num8);
                                                    contentValues.put("current_results", bArrZzbx3);
                                                    if (jVarG2.v().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        a1Var5.zzaA().g().c(i0.k(str9), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        cursorQuery4.close();
                                        map = eVar10;
                                    } else {
                                        z10 = z4;
                                        str18 = "data";
                                        cursorQuery4.close();
                                    }
                                } catch (SQLiteException e31) {
                                    e = e31;
                                    z10 = z4;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                r13 = jVarG4;
                                if (r13 != 0) {
                                    r13.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e32) {
                            e = e32;
                            z10 = z4;
                            str18 = "data";
                            cursorQuery4 = null;
                        } catch (Throwable th9) {
                            th = th9;
                            r13 = 0;
                            if (r13 != 0) {
                                r13.close();
                            }
                            throw th;
                        }
                        j jVarG15 = z2Var.G();
                        a1Var = (a1) jVarG15.f159a;
                        str2 = this.f11020d;
                        jVarG15.d();
                        jVarG15.c();
                        com.google.android.gms.common.internal.i0.e(str2);
                        cursorQuery = jVarG15.v().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map16 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map16;
                            str3 = "Database error querying filters. appId";
                        } else {
                            eVar9 = new r.e();
                            while (true) {
                                i12 = cursorQuery.getInt(0);
                                eVar9.put(Integer.valueOf(i12), (zzgi) ((zzgh) l0.B(zzgi.zze(), cursorQuery.getBlob(1))).zzaD());
                                a1Var2 = a1Var;
                                str3 = str17;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                a1Var = a1Var2;
                                str17 = str3;
                                str2 = str2;
                            }
                            cursorQuery.close();
                            map2 = eVar9;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            a1Var3 = a1Var11;
                        } else {
                            HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                            if (z10) {
                                String str26 = this.f11020d;
                                jVarG = z2Var.G();
                                str6 = this.f11020d;
                                jVarG.d();
                                jVarG.c();
                                com.google.android.gms.common.internal.i0.e(str6);
                                eVar3 = new r.e();
                                cursorRawQuery = jVarG.v().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) eVar3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            eVar3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    eVar3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r11 = eVar3;
                                com.google.android.gms.common.internal.i0.e(str26);
                                eVar4 = new r.e();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        zzgiVar3 = (zzgi) map2.get(num);
                                        list4 = (List) r11.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r17 = r11;
                                            it3 = it2;
                                            a1Var4 = a1Var11;
                                            eVar4.put(num, zzgiVar3);
                                            r11 = r17;
                                            it2 = it3;
                                            str19 = str19;
                                            a1Var11 = a1Var4;
                                        } else {
                                            ?? r18 = r11;
                                            it3 = it2;
                                            List listE = z2Var.K().E(zzgiVar3.zzi(), list4);
                                            if (listE.isEmpty()) {
                                                r11 = r18;
                                                it2 = it3;
                                            } else {
                                                zzgh zzghVar = (zzgh) zzgiVar3.zzbB();
                                                zzghVar.zzf();
                                                zzghVar.zzb(listE);
                                                List listE2 = z2Var.K().E(zzgiVar3.zzk(), list4);
                                                zzghVar.zzh();
                                                zzghVar.zzd(listE2);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it9 = zzgiVar3.zzh().iterator();
                                                while (it9.hasNext()) {
                                                    Iterator it10 = it9;
                                                    zzfr zzfrVar2 = (zzfr) it9.next();
                                                    a1 a1Var13 = a1Var11;
                                                    if (!list4.contains(Integer.valueOf(zzfrVar2.zza()))) {
                                                        arrayList6.add(zzfrVar2);
                                                    }
                                                    it9 = it10;
                                                    a1Var11 = a1Var13;
                                                }
                                                a1Var4 = a1Var11;
                                                zzghVar.zze();
                                                zzghVar.zza(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (zzgk zzgkVar2 : zzgiVar3.zzj()) {
                                                    if (!list4.contains(Integer.valueOf(zzgkVar2.zzb()))) {
                                                        arrayList7.add(zzgkVar2);
                                                    }
                                                }
                                                zzghVar.zzg();
                                                zzghVar.zzc(arrayList7);
                                                eVar4.put(num, (zzgi) zzghVar.zzaD());
                                                r17 = r18;
                                                r11 = r17;
                                                it2 = it3;
                                                str19 = str19;
                                                a1Var11 = a1Var4;
                                            }
                                        }
                                    }
                                }
                                str4 = str19;
                                a1Var3 = a1Var11;
                                map3 = eVar4;
                            } else {
                                str4 = "audience_id";
                                a1Var3 = a1Var11;
                                map3 = map2;
                            }
                            map4 = map;
                            while (r16.hasNext()) {
                                num4.getClass();
                                zzgiVar = (zzgi) map3.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                eVar = new r.e();
                                if (zzgiVar != null && zzgiVar.zza() != 0) {
                                    while (r3.hasNext()) {
                                        if (zzfrVar.zzh()) {
                                            zzgi zzgiVar10 = zzgiVar;
                                            Integer numValueOf11 = Integer.valueOf(zzfrVar.zza());
                                            if (zzfrVar.zzg()) {
                                                lValueOf = Long.valueOf(zzfrVar.zzb());
                                            } else {
                                                lValueOf = null;
                                            }
                                            eVar.put(numValueOf11, lValueOf);
                                            zzgiVar = zzgiVar10;
                                        }
                                    }
                                }
                                zzgiVar2 = zzgiVar;
                                eVar2 = new r.e();
                                if (zzgiVar2 != null && zzgiVar2.zzc() != 0) {
                                    it = zzgiVar2.zzj().iterator();
                                    while (it.hasNext()) {
                                        zzgkVar = (zzgk) it.next();
                                        if (!zzgkVar.zzi() && zzgkVar.zza() > 0) {
                                            eVar2.put(Integer.valueOf(zzgkVar.zzb()), Long.valueOf(zzgkVar.zzc(zzgkVar.zza() - 1)));
                                            it = it;
                                            map3 = map3;
                                        }
                                    }
                                }
                                Map map17 = map3;
                                if (zzgiVar2 != null) {
                                    i = 0;
                                    while (i < zzgiVar2.zzd() * 64) {
                                        if (l0.J(i, zzgiVar2.zzk())) {
                                            z11 = zL;
                                            a1Var3.zzaA().h().d(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
                                            bitSet2.set(i);
                                            if (l0.J(i, zzgiVar2.zzi())) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zL = z11;
                                        } else {
                                            z11 = zL;
                                        }
                                        eVar.remove(Integer.valueOf(i));
                                        i++;
                                        zL = z11;
                                    }
                                }
                                boolean z17 = zL;
                                zzgi zzgiVar11 = (zzgi) map2.get(num4);
                                if (zL2 && z17 && (list3 = (List) map4.get(num4)) != null && this.f11023s != null && this.f11022r != null) {
                                    while (r2.hasNext()) {
                                        int iZzb5 = zzekVar2.zzb();
                                        Integer num11 = num4;
                                        jLongValue = this.f11023s.longValue() / 1000;
                                        if (zzekVar2.zzm()) {
                                            jLongValue = this.f11022r.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iZzb5);
                                        if (eVar.containsKey(numValueOf)) {
                                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (eVar2.containsKey(numValueOf)) {
                                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.f11021f.put(num4, new g3(this, this.f11020d, zzgiVar11, bitSet, bitSet2, eVar, eVar2));
                                str18 = str18;
                                map2 = map2;
                                zL = z17;
                                map4 = map4;
                                map3 = map17;
                            }
                            str5 = str4;
                        }
                        str7 = str18;
                        String str27 = str3;
                        str8 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            lVar = new fd.l(this);
                            eVar7 = new r.e();
                            it6 = list.iterator();
                            while (it6.hasNext()) {
                                zzftVar = (zzft) it6.next();
                                zzftVarC = lVar.c(zzftVar, this.f11020d);
                                if (zzftVarC != null) {
                                    j jVarG16 = z2Var.G();
                                    a1Var8 = (a1) jVarG16.f159a;
                                    str13 = this.f11020d;
                                    strZzh = zzftVarC.zzh();
                                    nVarZ = jVarG16.z(str13, zzftVar.zzh());
                                    if (nVarZ == null) {
                                        a1Var8.zzaA().j().d(i0.k(str13), "Event aggregate wasn't created during raw event logging. appId, event", a1Var8.l().d(strZzh));
                                        nVar = new n(str13, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                    } else {
                                        nVar = new n(nVarZ.f11262a, nVarZ.f11263b, nVarZ.f11264c + 1, nVarZ.f11265d + 1, nVarZ.e + 1, nVarZ.f11266f, nVarZ.f11267g, nVarZ.h, nVarZ.i, nVarZ.f11268j, nVarZ.f11269k);
                                    }
                                    z2Var.G().k(nVar);
                                    strZzh2 = zzftVarC.zzh();
                                    map7 = (Map) eVar7.get(strZzh2);
                                    if (map7 == null) {
                                        j jVarG17 = z2Var.G();
                                        a1Var9 = (a1) jVarG17.f159a;
                                        str14 = this.f11020d;
                                        jVarG17.d();
                                        jVarG17.c();
                                        com.google.android.gms.common.internal.i0.e(str14);
                                        com.google.android.gms.common.internal.i0.e(strZzh2);
                                        eVar8 = new r.e();
                                        a1Var10 = a1Var9;
                                        cursorQuery3 = jVarG17.v().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str14, strZzh2}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            str15 = str14;
                                            while (true) {
                                                zzek zzekVar10 = (zzek) ((zzej) l0.B(zzek.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                                numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                list6 = (List) eVar8.get(numValueOf6);
                                                if (list6 == null) {
                                                    cursor3 = cursorQuery3;
                                                    arrayList4 = new ArrayList();
                                                    eVar8.put(numValueOf6, arrayList4);
                                                } else {
                                                    cursor3 = cursorQuery3;
                                                    arrayList4 = list6;
                                                }
                                                arrayList4.add(zzekVar10);
                                                if (!cursor3.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                cursorQuery3 = cursor3;
                                            }
                                            cursor3.close();
                                            map7 = eVar8;
                                        } else {
                                            cursor3 = cursorQuery3;
                                            map7 = Collections.EMPTY_MAP;
                                            cursor3.close();
                                        }
                                        eVar7.put(strZzh2, map7);
                                    }
                                    while (r25.hasNext()) {
                                        iIntValue2 = num6.intValue();
                                        if (this.e.contains(num6)) {
                                            a1Var3.zzaA().h().c(num6, "Skipping failed audience ID");
                                        } else {
                                            it7 = ((List) map7.get(num6)).iterator();
                                            zA = true;
                                            r12 = eVar7;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    map8 = map7;
                                                    lVar2 = lVar;
                                                    r29 = r12;
                                                    num3 = num6;
                                                    break;
                                                }
                                                zzek zzekVar11 = (zzek) it7.next();
                                                map8 = map7;
                                                lVar2 = lVar;
                                                r210 = r12;
                                                num3 = num6;
                                                n nVar6 = nVar;
                                                h3Var2 = new h3(this, this.f11020d, iIntValue2, zzekVar11, 0);
                                                Long l19 = this.f11022r;
                                                Long l110 = this.f11023s;
                                                iZzb = zzekVar11.zzb();
                                                g3Var = (g3) this.f11021f.get(num3);
                                                if (g3Var == null) {
                                                    z13 = false;
                                                } else {
                                                    z13 = g3Var.f11146d.get(iZzb);
                                                }
                                                i11 = iIntValue2;
                                                nVar = nVar6;
                                                zA = h3Var2.a(l19, l110, zzftVarC, nVar6.f11264c, nVar, z13);
                                                if (zA) {
                                                    this.e.add(num3);
                                                    r29 = r210;
                                                    break;
                                                }
                                                h(num3).b(h3Var2);
                                                iIntValue2 = i11;
                                                num6 = num3;
                                                lVar = lVar2;
                                                map7 = map8;
                                                r12 = r210;
                                            }
                                            if (!zA) {
                                                this.e.add(num3);
                                            }
                                            lVar = lVar2;
                                            map7 = map8;
                                            eVar7 = r29;
                                        }
                                    }
                                }
                            }
                        }
                        if (!list2.isEmpty()) {
                            eVar5 = new r.e();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                zzgm zzgmVar4 = (zzgm) it4.next();
                                strZzf = zzgmVar4.zzf();
                                map5 = (Map) eVar5.get(strZzf);
                                if (map5 == null) {
                                    j jVarG18 = z2Var.G();
                                    a1Var6 = (a1) jVarG18.f159a;
                                    str11 = this.f11020d;
                                    jVarG18.d();
                                    jVarG18.c();
                                    com.google.android.gms.common.internal.i0.e(str11);
                                    com.google.android.gms.common.internal.i0.e(strZzf);
                                    eVar6 = new r.e();
                                    cursorQuery2 = jVarG18.v().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzf}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        str10 = str7;
                                        while (true) {
                                            zzet zzetVar5 = (zzet) ((zzes) l0.B(zzet.zzc(), cursorQuery2.getBlob(1))).zzaD();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) eVar6.get(numValueOf5);
                                            if (list5 == null) {
                                                a1Var7 = a1Var6;
                                                arrayList3 = new ArrayList();
                                                eVar6.put(numValueOf5, arrayList3);
                                            } else {
                                                a1Var7 = a1Var6;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(zzetVar5);
                                            str12 = str11;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            a1Var6 = a1Var7;
                                            str11 = str12;
                                        }
                                        cursorQuery2.close();
                                        map5 = eVar6;
                                    } else {
                                        str10 = str7;
                                        map5 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    eVar5.put(strZzf, map5);
                                } else {
                                    str10 = str7;
                                }
                                map6 = map5;
                                while (r15.hasNext()) {
                                    iIntValue = num7.intValue();
                                    if (this.e.contains(num7)) {
                                        a1Var3.zzaA().h().c(num7, str8);
                                        break;
                                        break;
                                    }
                                    it5 = ((List) map6.get(num7)).iterator();
                                    zB = true;
                                    while (true) {
                                        if (it5.hasNext()) {
                                            zzetVar = (zzet) it5.next();
                                            if (Log.isLoggable(a1Var3.zzaA().o(), 2)) {
                                                fd.b bVarH5 = a1Var3.zzaA().h();
                                                if (zzetVar.zzj()) {
                                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                bVarH5.e("Evaluating filter. audience, filter, property", num7, numValueOf4, a1Var3.l().f(zzetVar.zze()));
                                                a1Var3.zzaA().h().c(z2Var.K().D(zzetVar), "Filter definition");
                                            }
                                            if (zzetVar.zzj() || zzetVar.zza() > 256) {
                                                num2 = num7;
                                                fd.b bVarJ5 = a1Var3.zzaA().j();
                                                h0 h0VarK5 = i0.k(this.f11020d);
                                                if (zzetVar.zzj()) {
                                                    numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                bVarJ5.d(h0VarK5, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
                                                this.e.add(num2);
                                                str8 = str8;
                                            } else {
                                                num2 = num7;
                                                h3Var = new h3(this, this.f11020d, i10, zzetVar, 1);
                                                Long l20 = this.f11022r;
                                                Long l21 = this.f11023s;
                                                int iZza = zzetVar.zza();
                                                g3 g3Var5 = (g3) this.f11021f.get(num2);
                                                if (g3Var5 == null) {
                                                    i10 = iIntValue;
                                                    z12 = false;
                                                } else {
                                                    i10 = iIntValue;
                                                    z12 = g3Var5.f11146d.get(iZza);
                                                }
                                                zB = h3Var.b(l20, l21, zzgmVar4, z12);
                                                if (zB) {
                                                    h(num2).b(h3Var);
                                                    iIntValue = iIntValue;
                                                    num7 = num2;
                                                    str8 = str8;
                                                } else {
                                                    this.e.add(num2);
                                                }
                                            }
                                        } else {
                                            str8 = str8;
                                            num2 = num7;
                                        }
                                        if (!zB) {
                                            this.e.add(num2);
                                        }
                                        str8 = str8;
                                    }
                                }
                                str7 = str10;
                            }
                        }
                        arrayList2 = new ArrayList();
                        r.b<Integer> bVar4 = (r.b) this.f11021f.keySet();
                        bVar4.removeAll(this.e);
                        while (r3.hasNext()) {
                            int iIntValue6 = num8.intValue();
                            g3 g3Var6 = (g3) this.f11021f.get(num8);
                            com.google.android.gms.common.internal.i0.i(g3Var6);
                            zzfp zzfpVarA4 = g3Var6.a(iIntValue6);
                            arrayList2.add(zzfpVarA4);
                            jVarG2 = z2Var.G();
                            a1Var5 = (a1) jVarG2.f159a;
                            str9 = this.f11020d;
                            zzgi zzgiVarZzd4 = zzfpVarA4.zzd();
                            jVarG2.d();
                            jVarG2.c();
                            com.google.android.gms.common.internal.i0.e(str9);
                            com.google.android.gms.common.internal.i0.i(zzgiVarZzd4);
                            byte[] bArrZzbx4 = zzgiVarZzd4.zzbx();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str9);
                            contentValues.put(str5, num8);
                            contentValues.put("current_results", bArrZzbx4);
                            if (jVarG2.v().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                a1Var5.zzaA().g().c(i0.k(str9), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z10 = z4;
                    str18 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map18 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map18;
                        str3 = "Database error querying filters. appId";
                    } else {
                        eVar9 = new r.e();
                        while (true) {
                            i12 = cursorQuery.getInt(0);
                            eVar9.put(Integer.valueOf(i12), (zzgi) ((zzgh) l0.B(zzgi.zze(), cursorQuery.getBlob(1))).zzaD());
                            a1Var2 = a1Var;
                            str3 = str17;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            a1Var = a1Var2;
                            str17 = str3;
                            str2 = str2;
                        }
                        cursorQuery.close();
                        map2 = eVar9;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e33) {
                e = e33;
                a1Var2 = a1Var;
                str3 = "Database error querying filters. appId";
            }
            cursorQuery = jVarG15.v().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
        } catch (SQLiteException e34) {
            e = e34;
            a1Var2 = a1Var;
            str3 = "Database error querying filters. appId";
            str2 = str2;
            cursorQuery = null;
        } catch (Throwable th11) {
            th = th11;
            cursorQuery = null;
        }
        map = map9;
        j jVarG19 = z2Var.G();
        a1Var = (a1) jVarG19.f159a;
        str2 = this.f11020d;
        jVarG19.d();
        jVarG19.c();
        com.google.android.gms.common.internal.i0.e(str2);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            a1Var3 = a1Var11;
        } else {
            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
            if (z10) {
                String str28 = this.f11020d;
                jVarG = z2Var.G();
                str6 = this.f11020d;
                jVarG.d();
                jVarG.c();
                com.google.android.gms.common.internal.i0.e(str6);
                eVar3 = new r.e();
                cursorRawQuery = jVarG.v().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) eVar3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            eVar3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    eVar3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r11 = eVar3;
                com.google.android.gms.common.internal.i0.e(str28);
                eVar4 = new r.e();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        zzgiVar3 = (zzgi) map2.get(num);
                        list4 = (List) r11.get(num);
                        if (list4 != null) {
                        }
                        r17 = r11;
                        it3 = it2;
                        a1Var4 = a1Var11;
                        eVar4.put(num, zzgiVar3);
                        r11 = r17;
                        it2 = it3;
                        str19 = str19;
                        a1Var11 = a1Var4;
                    }
                }
                str4 = str19;
                a1Var3 = a1Var11;
                map3 = eVar4;
            } else {
                str4 = "audience_id";
                a1Var3 = a1Var11;
                map3 = map2;
            }
            map4 = map;
            while (r16.hasNext()) {
                num4.getClass();
                zzgiVar = (zzgi) map3.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                eVar = new r.e();
                if (zzgiVar != null) {
                    while (r3.hasNext()) {
                        if (zzfrVar.zzh()) {
                            zzgi zzgiVar12 = zzgiVar;
                            Integer numValueOf12 = Integer.valueOf(zzfrVar.zza());
                            if (zzfrVar.zzg()) {
                                lValueOf = Long.valueOf(zzfrVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            eVar.put(numValueOf12, lValueOf);
                            zzgiVar = zzgiVar12;
                        }
                    }
                }
                zzgiVar2 = zzgiVar;
                eVar2 = new r.e();
                if (zzgiVar2 != null) {
                    it = zzgiVar2.zzj().iterator();
                    while (it.hasNext()) {
                        zzgkVar = (zzgk) it.next();
                        if (!zzgkVar.zzi()) {
                        }
                    }
                }
                Map map19 = map3;
                if (zzgiVar2 != null) {
                    i = 0;
                    while (i < zzgiVar2.zzd() * 64) {
                        if (l0.J(i, zzgiVar2.zzk())) {
                            z11 = zL;
                            a1Var3.zzaA().h().d(num4, "Filter already evaluated. audience ID, filter ID", Integer.valueOf(i));
                            bitSet2.set(i);
                            if (l0.J(i, zzgiVar2.zzi())) {
                                bitSet.set(i);
                            }
                            i++;
                            zL = z11;
                        } else {
                            z11 = zL;
                        }
                        eVar.remove(Integer.valueOf(i));
                        i++;
                        zL = z11;
                    }
                }
                boolean z18 = zL;
                zzgi zzgiVar13 = (zzgi) map2.get(num4);
                if (zL2) {
                    while (r2.hasNext()) {
                        int iZzb6 = zzekVar2.zzb();
                        Integer num12 = num4;
                        jLongValue = this.f11023s.longValue() / 1000;
                        if (zzekVar2.zzm()) {
                            jLongValue = this.f11022r.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iZzb6);
                        if (eVar.containsKey(numValueOf)) {
                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (eVar2.containsKey(numValueOf)) {
                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f11021f.put(num4, new g3(this, this.f11020d, zzgiVar13, bitSet, bitSet2, eVar, eVar2));
                str18 = str18;
                map2 = map2;
                zL = z18;
                map4 = map4;
                map3 = map19;
            }
            str5 = str4;
        }
        str7 = str18;
        String str29 = str3;
        str8 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            lVar = new fd.l(this);
            eVar7 = new r.e();
            it6 = list.iterator();
            while (it6.hasNext()) {
                zzftVar = (zzft) it6.next();
                zzftVarC = lVar.c(zzftVar, this.f11020d);
                if (zzftVarC != null) {
                    j jVarG110 = z2Var.G();
                    a1Var8 = (a1) jVarG110.f159a;
                    str13 = this.f11020d;
                    strZzh = zzftVarC.zzh();
                    nVarZ = jVarG110.z(str13, zzftVar.zzh());
                    if (nVarZ == null) {
                        a1Var8.zzaA().j().d(i0.k(str13), "Event aggregate wasn't created during raw event logging. appId, event", a1Var8.l().d(strZzh));
                        nVar = new n(str13, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                    } else {
                        nVar = new n(nVarZ.f11262a, nVarZ.f11263b, nVarZ.f11264c + 1, nVarZ.f11265d + 1, nVarZ.e + 1, nVarZ.f11266f, nVarZ.f11267g, nVarZ.h, nVarZ.i, nVarZ.f11268j, nVarZ.f11269k);
                    }
                    z2Var.G().k(nVar);
                    strZzh2 = zzftVarC.zzh();
                    map7 = (Map) eVar7.get(strZzh2);
                    if (map7 == null) {
                        j jVarG111 = z2Var.G();
                        a1Var9 = (a1) jVarG111.f159a;
                        str14 = this.f11020d;
                        jVarG111.d();
                        jVarG111.c();
                        com.google.android.gms.common.internal.i0.e(str14);
                        com.google.android.gms.common.internal.i0.e(strZzh2);
                        eVar8 = new r.e();
                        a1Var10 = a1Var9;
                        cursorQuery3 = jVarG111.v().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str14, strZzh2}, null, null, null);
                        if (cursorQuery3.moveToFirst()) {
                            str15 = str14;
                            while (true) {
                                zzek zzekVar12 = (zzek) ((zzej) l0.B(zzek.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                list6 = (List) eVar8.get(numValueOf6);
                                if (list6 == null) {
                                    cursor3 = cursorQuery3;
                                    arrayList4 = new ArrayList();
                                    eVar8.put(numValueOf6, arrayList4);
                                } else {
                                    cursor3 = cursorQuery3;
                                    arrayList4 = list6;
                                }
                                arrayList4.add(zzekVar12);
                                if (!cursor3.moveToNext()) {
                                    break;
                                    break;
                                }
                                cursorQuery3 = cursor3;
                            }
                            cursor3.close();
                            map7 = eVar8;
                        } else {
                            cursor3 = cursorQuery3;
                            map7 = Collections.EMPTY_MAP;
                            cursor3.close();
                        }
                        eVar7.put(strZzh2, map7);
                    }
                    while (r25.hasNext()) {
                        iIntValue2 = num6.intValue();
                        if (this.e.contains(num6)) {
                            a1Var3.zzaA().h().c(num6, "Skipping failed audience ID");
                        } else {
                            it7 = ((List) map7.get(num6)).iterator();
                            zA = true;
                            r12 = eVar7;
                            while (true) {
                                if (it7.hasNext()) {
                                    map8 = map7;
                                    lVar2 = lVar;
                                    r29 = r12;
                                    num3 = num6;
                                    break;
                                }
                                zzek zzekVar13 = (zzek) it7.next();
                                map8 = map7;
                                lVar2 = lVar;
                                r210 = r12;
                                num3 = num6;
                                n nVar7 = nVar;
                                h3Var2 = new h3(this, this.f11020d, iIntValue2, zzekVar13, 0);
                                Long l111 = this.f11022r;
                                Long l112 = this.f11023s;
                                iZzb = zzekVar13.zzb();
                                g3Var = (g3) this.f11021f.get(num3);
                                if (g3Var == null) {
                                    z13 = false;
                                } else {
                                    z13 = g3Var.f11146d.get(iZzb);
                                }
                                i11 = iIntValue2;
                                nVar = nVar7;
                                zA = h3Var2.a(l111, l112, zzftVarC, nVar7.f11264c, nVar, z13);
                                if (zA) {
                                    this.e.add(num3);
                                    r29 = r210;
                                    break;
                                }
                                h(num3).b(h3Var2);
                                iIntValue2 = i11;
                                num6 = num3;
                                lVar = lVar2;
                                map7 = map8;
                                r12 = r210;
                            }
                            if (!zA) {
                                this.e.add(num3);
                            }
                            lVar = lVar2;
                            map7 = map8;
                            eVar7 = r29;
                        }
                    }
                }
            }
        }
        if (!list2.isEmpty()) {
            eVar5 = new r.e();
            it4 = list2.iterator();
            while (it4.hasNext()) {
                zzgm zzgmVar5 = (zzgm) it4.next();
                strZzf = zzgmVar5.zzf();
                map5 = (Map) eVar5.get(strZzf);
                if (map5 == null) {
                    j jVarG112 = z2Var.G();
                    a1Var6 = (a1) jVarG112.f159a;
                    str11 = this.f11020d;
                    jVarG112.d();
                    jVarG112.c();
                    com.google.android.gms.common.internal.i0.e(str11);
                    com.google.android.gms.common.internal.i0.e(strZzf);
                    eVar6 = new r.e();
                    cursorQuery2 = jVarG112.v().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str11, strZzf}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        str10 = str7;
                        while (true) {
                            zzet zzetVar6 = (zzet) ((zzes) l0.B(zzet.zzc(), cursorQuery2.getBlob(1))).zzaD();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) eVar6.get(numValueOf5);
                            if (list5 == null) {
                                a1Var7 = a1Var6;
                                arrayList3 = new ArrayList();
                                eVar6.put(numValueOf5, arrayList3);
                            } else {
                                a1Var7 = a1Var6;
                                arrayList3 = list5;
                            }
                            arrayList3.add(zzetVar6);
                            str12 = str11;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            a1Var6 = a1Var7;
                            str11 = str12;
                        }
                        cursorQuery2.close();
                        map5 = eVar6;
                    } else {
                        str10 = str7;
                        map5 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    eVar5.put(strZzf, map5);
                } else {
                    str10 = str7;
                }
                map6 = map5;
                while (r15.hasNext()) {
                    iIntValue = num7.intValue();
                    if (this.e.contains(num7)) {
                        a1Var3.zzaA().h().c(num7, str8);
                        break;
                        break;
                    }
                    it5 = ((List) map6.get(num7)).iterator();
                    zB = true;
                    while (true) {
                        if (it5.hasNext()) {
                            zzetVar = (zzet) it5.next();
                            if (Log.isLoggable(a1Var3.zzaA().o(), 2)) {
                                fd.b bVarH6 = a1Var3.zzaA().h();
                                if (zzetVar.zzj()) {
                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                } else {
                                    numValueOf4 = null;
                                }
                                bVarH6.e("Evaluating filter. audience, filter, property", num7, numValueOf4, a1Var3.l().f(zzetVar.zze()));
                                a1Var3.zzaA().h().c(z2Var.K().D(zzetVar), "Filter definition");
                            }
                            if (zzetVar.zzj()) {
                            }
                            num2 = num7;
                            fd.b bVarJ6 = a1Var3.zzaA().j();
                            h0 h0VarK6 = i0.k(this.f11020d);
                            if (zzetVar.zzj()) {
                                numValueOf3 = Integer.valueOf(zzetVar.zza());
                            } else {
                                numValueOf3 = null;
                            }
                            bVarJ6.d(h0VarK6, "Invalid property filter ID. appId, id", String.valueOf(numValueOf3));
                            this.e.add(num2);
                            str8 = str8;
                        } else {
                            str8 = str8;
                            num2 = num7;
                        }
                        if (!zB) {
                            this.e.add(num2);
                        }
                        str8 = str8;
                        h(num2).b(h3Var);
                        iIntValue = iIntValue;
                        num7 = num2;
                        str8 = str8;
                    }
                }
                str7 = str10;
            }
        }
        arrayList2 = new ArrayList();
        r.b<Integer> bVar5 = (r.b) this.f11021f.keySet();
        bVar5.removeAll(this.e);
        while (r3.hasNext()) {
            int iIntValue7 = num8.intValue();
            g3 g3Var7 = (g3) this.f11021f.get(num8);
            com.google.android.gms.common.internal.i0.i(g3Var7);
            zzfp zzfpVarA5 = g3Var7.a(iIntValue7);
            arrayList2.add(zzfpVarA5);
            jVarG2 = z2Var.G();
            a1Var5 = (a1) jVarG2.f159a;
            str9 = this.f11020d;
            zzgi zzgiVarZzd5 = zzfpVarA5.zzd();
            jVarG2.d();
            jVarG2.c();
            com.google.android.gms.common.internal.i0.e(str9);
            com.google.android.gms.common.internal.i0.i(zzgiVarZzd5);
            byte[] bArrZzbx5 = zzgiVarZzd5.zzbx();
            contentValues = new ContentValues();
            contentValues.put("app_id", str9);
            contentValues.put(str5, num8);
            contentValues.put("current_results", bArrZzbx5);
            if (jVarG2.v().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                a1Var5.zzaA().g().c(i0.k(str9), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final g3 h(Integer num) {
        if (this.f11021f.containsKey(num)) {
            return (g3) this.f11021f.get(num);
        }
        g3 g3Var = new g3(this, this.f11020d);
        this.f11021f.put(num, g3Var);
        return g3Var;
    }

    @Override // z7.w2
    public final void f() {
    }
}
