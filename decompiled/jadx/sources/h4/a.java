package h4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import u3.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z9.c f4926f = new z9.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a4.b f4927g = new a4.b(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4929b;
    public final aa.c e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z9.c f4931d = f4926f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4.b f4930c = f4927g;

    public a(Context context, ArrayList arrayList, x3.a aVar, x3.f fVar) {
        this.f4928a = context.getApplicationContext();
        this.f4929b = arrayList;
        this.e = new aa.c(28, aVar, fVar);
    }

    public static int d(t3.b bVar, int i, int i10) {
        int iMin = Math.min(bVar.f8572g / i10, bVar.f8571f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbD = u3.b.d(iMax, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbD.append(i10);
            sbD.append("], actual dimens: [");
            sbD.append(bVar.f8571f);
            sbD.append("x");
            sbD.append(bVar.f8572g);
            sbD.append("]");
            Log.v("BufferGifDecoder", sbD.toString());
        }
        return iMax;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // u3.k
    public final w3.x a(java.lang.Object r8, int r9, int r10, u3.i r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            a4.b r8 = r7.f4930c
            monitor-enter(r8)
            java.lang.Object r0 = r8.f113b     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L56
            t3.c r0 = (t3.c) r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L17
            t3.c r0 = new t3.c     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L59
        L1d:
            r0 = 0
            r5.f8576b = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.f8575a     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            t3.b r0 = new t3.b     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.f8577c = r0     // Catch: java.lang.Throwable -> L56
            r5.f8578d = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.f8576b = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.f8576b     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            f4.d r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            a4.b r9 = r1.f4930c
            r9.q(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            a4.b r9 = r1.f4930c
            r9.q(r5)
            throw r8
        L56:
            r0 = move-exception
            r1 = r7
        L58:
            r9 = r0
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            throw r9
        L5b:
            r0 = move-exception
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.a.a(java.lang.Object, int, int, u3.i):w3.x");
    }

    @Override // u3.k
    public final boolean b(Object obj, u3.i iVar) {
        return !((Boolean) iVar.c(h.f4964b)).booleanValue() && n9.b.q(this.f4929b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:602)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:628)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public final f4.d c(ByteBuffer byteBuffer, int i, int i10, t3.c cVar, u3.i iVar) {
        StringBuilder sb2;
        int i11 = p4.h.f7800b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            t3.b bVarB = cVar.b();
            f4.d dVar = null;
            if (bVarB.f8569c > 0 && bVarB.f8568b == 0) {
                Bitmap.Config config = iVar.c(h.f4963a) == u3.a.f8843b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(bVarB, i, i10);
                z9.c cVar2 = this.f4931d;
                aa.c cVar3 = this.e;
                cVar2.getClass();
                t3.d dVar2 = new t3.d(cVar3, bVarB, byteBuffer, iD);
                dVar2.c(config);
                dVar2.f8586k = (dVar2.f8586k + 1) % dVar2.f8587l.f8569c;
                Bitmap bitmapB = dVar2.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder("Decoded GIF from stream in ");
                    }
                    return null;
                }
                dVar = new f4.d(new c(new b(new g(com.bumptech.glide.b.a(this.f4928a), dVar2, i, i10, bitmapB), 0)), 1);
                if (!Log.isLoggable("BufferGifDecoder", 2)) {
                    return dVar;
                }
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(p4.h.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return dVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(p4.h.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return dVar;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + p4.h.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
