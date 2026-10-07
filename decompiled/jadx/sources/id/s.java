package id;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f5322d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.h f5323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f5324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5325c;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        jc.i.d(logger, "getLogger(Http2::class.java.name)");
        f5322d = logger;
    }

    public s(od.p pVar) {
        jc.i.e(pVar, "source");
        this.f5323a = pVar;
        r rVar = new r(pVar);
        this.f5324b = rVar;
        this.f5325c = new c(rVar);
    }

    public final void B(k kVar, int i, int i10, int i11) throws IOException {
        int i12;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i10 & 8) != 0) {
            byte b10 = this.f5323a.readByte();
            byte[] bArr = cd.b.f1822a;
            i12 = b10 & 255;
        } else {
            i12 = 0;
        }
        int i13 = this.f5323a.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        List listG = g(q.a(i - 4, i10, i12), i12, i10, i11);
        o oVar = kVar.f5290b;
        synchronized (oVar) {
            if (oVar.J.contains(Integer.valueOf(i13))) {
                oVar.G(i13, 2);
                return;
            }
            oVar.J.add(Integer.valueOf(i13));
            oVar.f5304t.c(new m(oVar.f5299c + '[' + i13 + "] onRequest", oVar, i13, listG), 0L);
        }
    }

    public final boolean c(boolean z4, k kVar) throws IOException {
        int i;
        int i10;
        int i11;
        Object[] array;
        int i12 = 0;
        try {
            this.f5323a.P(9L);
            int iS = cd.b.s(this.f5323a);
            if (iS > 16384) {
                throw new IOException(da.v.f(iS, "FRAME_SIZE_ERROR: "));
            }
            int i13 = this.f5323a.readByte() & 255;
            byte b10 = this.f5323a.readByte();
            int i14 = b10 & 255;
            int i15 = this.f5323a.readInt();
            int i16 = i15 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            Logger logger = f5322d;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(f.a(i16, iS, i13, i14, true));
            }
            if (z4 && i13 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = f.f5281b;
                sb2.append(i13 < strArr.length ? strArr[i13] : cd.b.h("0x%02x", Integer.valueOf(i13)));
                throw new IOException(sb2.toString());
            }
            int i17 = 3;
            int i18 = 2;
            switch (i13) {
                case 0:
                    d(kVar, iS, i14, i16);
                    return true;
                case 1:
                    o(kVar, iS, i14, i16);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException(q1.a.j(iS, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i16 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    od.h hVar = this.f5323a;
                    hVar.readInt();
                    hVar.readByte();
                    return true;
                case 3:
                    if (iS != 4) {
                        throw new IOException(q1.a.j(iS, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i16 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i19 = this.f5323a.readInt();
                    int[] iArrE = u.e.e(14);
                    int length = iArrE.length;
                    int i20 = 0;
                    while (true) {
                        if (i20 < length) {
                            int i21 = iArrE[i20];
                            if (u.e.d(i21) == i19) {
                                i = i21;
                            } else {
                                i20++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        throw new IOException(da.v.f(i19, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    o oVar = kVar.f5290b;
                    if (i16 != 0 && (i15 & 1) == 0) {
                        i12 = 1;
                    }
                    if (i12 == 0) {
                        w wVarG = oVar.g(i16);
                        if (wVarG == null) {
                            return true;
                        }
                        wVarG.j(i);
                        return true;
                    }
                    oVar.f5304t.c(new j(oVar.f5299c + '[' + i16 + "] onReset", oVar, i16, i, 1), 0L);
                    return true;
                case 4:
                    od.h hVar2 = this.f5323a;
                    if (i16 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b10 & 1) == 0) {
                        if (iS % 6 != 0) {
                            throw new IOException(da.v.f(iS, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        a0 a0Var = new a0();
                        mc.d dVarJ = jd.d.J(jd.d.L(0, iS), 6);
                        int i22 = dVarJ.f7106a;
                        int i23 = dVarJ.f7107b;
                        int i24 = dVarJ.f7108c;
                        if ((i24 > 0 && i22 <= i23) || (i24 < 0 && i23 <= i22)) {
                            while (true) {
                                short s10 = hVar2.readShort();
                                byte[] bArr = cd.b.f1822a;
                                int i25 = s10 & 65535;
                                i10 = hVar2.readInt();
                                if (i25 != 2) {
                                    if (i25 == i17) {
                                        i25 = 4;
                                    } else if (i25 == 4) {
                                        if (i10 < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i25 = 7;
                                    } else if (i25 == 5 && (i10 < 16384 || i10 > 16777215)) {
                                    }
                                } else if (i10 != 0 && i10 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                a0Var.c(i25, i10);
                                if (i22 != i23) {
                                    i22 += i24;
                                    i17 = 3;
                                }
                            }
                            throw new IOException(da.v.f(i10, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        o oVar2 = kVar.f5290b;
                        oVar2.f5303s.c(new i(q1.a.m(new StringBuilder(), oVar2.f5299c, " applyAndAckSettings"), kVar, a0Var, i18), 0L);
                        return true;
                    }
                    if (iS != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    break;
                case 5:
                    B(kVar, iS, i14, i16);
                    return true;
                case 6:
                    if (iS != 8) {
                        throw new IOException(da.v.f(iS, "TYPE_PING length != 8: "));
                    }
                    if (i16 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    int i26 = this.f5323a.readInt();
                    int i27 = this.f5323a.readInt();
                    if (((b10 & 1) != 0 ? 1 : 0) == 0) {
                        kVar.f5290b.f5303s.c(new j(q1.a.m(new StringBuilder(), kVar.f5290b.f5299c, " ping"), kVar.f5290b, i26, i27, 0), 0L);
                        return true;
                    }
                    o oVar3 = kVar.f5290b;
                    synchronized (oVar3) {
                        try {
                            if (i26 == 1) {
                                oVar3.f5307w++;
                            } else if (i26 == 2) {
                                oVar3.f5309y++;
                            } else if (i26 == 3) {
                                oVar3.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iS < 8) {
                        throw new IOException(da.v.f(iS, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i16 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i28 = this.f5323a.readInt();
                    int i29 = this.f5323a.readInt();
                    int i30 = iS - 8;
                    int[] iArrE2 = u.e.e(14);
                    int length2 = iArrE2.length;
                    int i31 = 0;
                    while (true) {
                        if (i31 < length2) {
                            i11 = iArrE2[i31];
                            if (u.e.d(i11) != i29) {
                                i31++;
                            }
                        } else {
                            i11 = 0;
                        }
                    }
                    if (i11 == 0) {
                        throw new IOException(da.v.f(i29, "TYPE_GOAWAY unexpected error code: "));
                    }
                    od.i iVarH = od.i.f7735d;
                    if (i30 > 0) {
                        iVarH = this.f5323a.h(i30);
                    }
                    jc.i.e(iVarH, "debugData");
                    iVarH.a();
                    o oVar4 = kVar.f5290b;
                    synchronized (oVar4) {
                        array = oVar4.f5298b.values().toArray(new w[0]);
                        oVar4.f5301f = true;
                    }
                    w[] wVarArr = (w[]) array;
                    int length3 = wVarArr.length;
                    while (i12 < length3) {
                        w wVar = wVarArr[i12];
                        if (wVar.f5336a > i28 && wVar.g()) {
                            wVar.j(8);
                            kVar.f5290b.g(wVar.f5336a);
                        }
                        i12++;
                    }
                    break;
                    break;
                case 8:
                    if (iS != 4) {
                        throw new IOException(da.v.f(iS, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j4 = ((long) this.f5323a.readInt()) & 2147483647L;
                    if (j4 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i16 == 0) {
                        o oVar5 = kVar.f5290b;
                        synchronized (oVar5) {
                            oVar5.F += j4;
                            oVar5.notifyAll();
                        }
                        return true;
                    }
                    w wVarD = kVar.f5290b.d(i16);
                    if (wVarD != null) {
                        synchronized (wVarD) {
                            wVarD.f5340f += j4;
                            if (j4 > 0) {
                                wVarD.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    break;
                default:
                    this.f5323a.skip(iS);
                    return true;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5323a.close();
    }

    public final void d(k kVar, int i, int i10, int i11) throws IOException {
        int i12;
        boolean z4;
        long j4;
        boolean z10;
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z11 = (i10 & 1) != 0;
        if ((i10 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i10 & 8) != 0) {
            byte b10 = this.f5323a.readByte();
            byte[] bArr = cd.b.f1822a;
            i12 = b10 & 255;
        } else {
            i12 = 0;
        }
        int iA = q.a(i, i10, i12);
        od.h hVar = this.f5323a;
        jc.i.e(hVar, "source");
        o oVar = kVar.f5290b;
        long j10 = 0;
        if (i11 == 0 || (i11 & 1) != 0) {
            w wVarD = oVar.d(i11);
            if (wVarD == null) {
                kVar.f5290b.G(i11, 2);
                long j11 = iA;
                kVar.f5290b.B(j11);
                hVar.skip(j11);
            } else {
                byte[] bArr2 = cd.b.f1822a;
                u uVar = wVarD.i;
                long j12 = iA;
                uVar.getClass();
                long j13 = j12;
                while (true) {
                    if (j13 <= j10) {
                        w wVar = uVar.f5334f;
                        byte[] bArr3 = cd.b.f1822a;
                        wVar.f5337b.B(j12);
                        break;
                    }
                    synchronized (uVar.f5334f) {
                        z4 = uVar.f5331b;
                        j4 = j10;
                        z10 = uVar.f5333d.f7734b + j13 > uVar.f5330a;
                    }
                    if (z10) {
                        hVar.skip(j13);
                        uVar.f5334f.e(4);
                        break;
                    }
                    if (z4) {
                        hVar.skip(j13);
                        break;
                    }
                    long jT = hVar.t(j13, uVar.f5332c);
                    if (jT == -1) {
                        throw new EOFException();
                    }
                    j13 -= jT;
                    w wVar2 = uVar.f5334f;
                    synchronized (wVar2) {
                        try {
                            if (uVar.e) {
                                od.f fVar = uVar.f5332c;
                                fVar.skip(fVar.f7734b);
                            } else {
                                od.f fVar2 = uVar.f5333d;
                                boolean z12 = fVar2.f7734b == j4;
                                fVar2.U(uVar.f5332c);
                                if (z12) {
                                    wVar2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j10 = j4;
                }
                if (z11) {
                    wVarD.i(cd.b.f1823b, true);
                }
            }
        } else {
            od.f fVar3 = new od.f();
            long j14 = iA;
            hVar.P(j14);
            hVar.t(j14, fVar3);
            oVar.f5304t.c(new l(oVar.f5299c + '[' + i11 + "] onData", oVar, i11, fVar3, iA, z11), 0L);
        }
        this.f5323a.skip(i12);
    }

    public final List g(int i, int i10, int i11, int i12) throws IOException {
        r rVar = this.f5324b;
        rVar.e = i;
        rVar.f5318b = i;
        rVar.f5321f = i10;
        rVar.f5319c = i11;
        rVar.f5320d = i12;
        c cVar = this.f5325c;
        od.p pVar = cVar.f5268c;
        ArrayList arrayList = cVar.f5267b;
        while (!pVar.c()) {
            byte b10 = pVar.readByte();
            byte[] bArr = cd.b.f1822a;
            int i13 = b10 & 255;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & 128) == 128) {
                int iE = cVar.e(i13, 127);
                int i14 = iE - 1;
                if (i14 >= 0) {
                    b[] bVarArr = e.f5278a;
                    if (i14 <= bVarArr.length - 1) {
                        arrayList.add(bVarArr[i14]);
                    }
                }
                int length = cVar.e + 1 + (i14 - e.f5278a.length);
                if (length >= 0) {
                    b[] bVarArr2 = cVar.f5269d;
                    if (length < bVarArr2.length) {
                        b bVar = bVarArr2[length];
                        jc.i.b(bVar);
                        arrayList.add(bVar);
                    }
                }
                throw new IOException(da.v.f(iE, "Header index too large "));
            }
            if (i13 == 64) {
                b[] bVarArr3 = e.f5278a;
                od.i iVarD = cVar.d();
                e.a(iVarD);
                cVar.c(new b(iVarD, cVar.d()));
            } else if ((b10 & 64) == 64) {
                cVar.c(new b(cVar.b(cVar.e(i13, 63) - 1), cVar.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = cVar.e(i13, 31);
                cVar.f5266a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + cVar.f5266a);
                }
                int i15 = cVar.f5271g;
                if (iE2 < i15) {
                    if (iE2 == 0) {
                        b[] bVarArr4 = cVar.f5269d;
                        vb.h.N(bVarArr4, 0, bVarArr4.length);
                        cVar.e = cVar.f5269d.length - 1;
                        cVar.f5270f = 0;
                        cVar.f5271g = 0;
                    } else {
                        cVar.a(i15 - iE2);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                b[] bVarArr5 = e.f5278a;
                od.i iVarD2 = cVar.d();
                e.a(iVarD2);
                arrayList.add(new b(iVarD2, cVar.d()));
            } else {
                arrayList.add(new b(cVar.b(cVar.e(i13, 15) - 1), cVar.d()));
            }
        }
        List listN0 = vb.i.n0(arrayList);
        arrayList.clear();
        return listN0;
    }

    public final void o(k kVar, int i, int i10, int i11) throws IOException {
        if (i11 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        int i12 = 0;
        int i13 = 1;
        boolean z4 = (i10 & 1) != 0;
        if ((i10 & 8) != 0) {
            byte b10 = this.f5323a.readByte();
            byte[] bArr = cd.b.f1822a;
            i12 = b10 & 255;
        }
        if ((i10 & 32) != 0) {
            od.h hVar = this.f5323a;
            hVar.readInt();
            hVar.readByte();
            byte[] bArr2 = cd.b.f1822a;
            i -= 5;
        }
        List listG = g(q.a(i, i10, i12), i12, i10, i11);
        o oVar = kVar.f5290b;
        if (i11 != 0 && (i11 & 1) == 0) {
            oVar.f5304t.c(new m(oVar.f5299c + '[' + i11 + "] onHeaders", oVar, i11, listG, z4), 0L);
            return;
        }
        synchronized (oVar) {
            w wVarD = oVar.d(i11);
            if (wVarD != null) {
                wVarD.i(cd.b.u(listG), z4);
                return;
            }
            if (oVar.f5301f) {
                return;
            }
            if (i11 <= oVar.f5300d) {
                return;
            }
            if (i11 % 2 == oVar.e % 2) {
                return;
            }
            w wVar = new w(i11, oVar, false, z4, cd.b.u(listG));
            oVar.f5300d = i11;
            oVar.f5298b.put(Integer.valueOf(i11), wVar);
            oVar.f5302r.e().c(new i(oVar.f5299c + '[' + i11 + "] onStream", oVar, wVar, i13), 0L);
        }
    }
}
