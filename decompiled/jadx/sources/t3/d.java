package t3;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import x3.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8579a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.c f8581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f8582d;
    public byte[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f8583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f8584g;
    public byte[] h;
    public byte[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f8585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f8587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f8588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f8589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f8594s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8580b = new int[256];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f8595t = Bitmap.Config.ARGB_8888;

    public d(aa.c cVar, b bVar, ByteBuffer byteBuffer, int i) {
        this.f8581c = cVar;
        this.f8587l = new b();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                int i10 = 0;
                this.f8590o = 0;
                this.f8587l = bVar;
                this.f8586k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f8582d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f8582d.order(ByteOrder.LITTLE_ENDIAN);
                this.f8589n = false;
                ArrayList arrayList = bVar.e;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (((a) obj).f8564g == 3) {
                        this.f8589n = true;
                        break;
                    }
                }
                this.f8591p = iHighestOneBit;
                int i11 = bVar.f8571f;
                this.f8593r = i11 / iHighestOneBit;
                int i12 = bVar.f8572g;
                this.f8592q = i12 / iHighestOneBit;
                int i13 = i11 * i12;
                f fVar = (f) this.f8581c.f264c;
                this.i = fVar == null ? new byte[i13] : (byte[]) fVar.c(i13, byte[].class);
                aa.c cVar2 = this.f8581c;
                int i14 = this.f8593r * this.f8592q;
                f fVar2 = (f) cVar2.f264c;
                this.f8585j = fVar2 == null ? new int[i14] : (int[]) fVar2.c(i14, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f8594s;
        Bitmap bitmapA = ((x3.a) this.f8581c.f263b).a(this.f8593r, this.f8592q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f8595t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f8587l.f8569c <= 0 || this.f8586k < 0) {
                if (Log.isLoggable("d", 3)) {
                    Log.d("d", "Unable to decode frame, frameCount=" + this.f8587l.f8569c + ", framePointer=" + this.f8586k);
                }
                this.f8590o = 1;
            }
            int i = this.f8590o;
            if (i != 1 && i != 2) {
                this.f8590o = 0;
                if (this.e == null) {
                    f fVar = (f) this.f8581c.f264c;
                    this.e = fVar == null ? new byte[255] : (byte[]) fVar.c(255, byte[].class);
                }
                a aVar = (a) this.f8587l.e.get(this.f8586k);
                int i10 = this.f8586k - 1;
                a aVar2 = i10 >= 0 ? (a) this.f8587l.e.get(i10) : null;
                int[] iArr = aVar.f8566k;
                if (iArr == null) {
                    iArr = this.f8587l.f8567a;
                }
                this.f8579a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("d", 3)) {
                        Log.d("d", "No valid color table found for frame #" + this.f8586k);
                    }
                    this.f8590o = 1;
                    return null;
                }
                if (aVar.f8563f) {
                    System.arraycopy(iArr, 0, this.f8580b, 0, iArr.length);
                    int[] iArr2 = this.f8580b;
                    this.f8579a = iArr2;
                    iArr2[aVar.h] = 0;
                    if (aVar.f8564g == 2 && this.f8586k == 0) {
                        this.f8594s = Boolean.TRUE;
                    }
                }
                return d(aVar, aVar2);
            }
            if (Log.isLoggable("d", 3)) {
                Log.d("d", "Unable to decode frame, status=" + this.f8590o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f8595t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc A[PHI: r5
      0x01dc: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    public final Bitmap d(a aVar, a aVar2) {
        byte b10;
        int i;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        short s10;
        int i14;
        Bitmap bitmap;
        int i15;
        aa.c cVar = this.f8581c;
        byte b11 = 0;
        int[] iArr2 = this.f8585j;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.f8588m;
            if (bitmap2 != null) {
                ((x3.a) cVar.f263b).c(bitmap2);
            }
            this.f8588m = null;
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && aVar2.f8564g == 3 && this.f8588m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && (i14 = aVar2.f8564g) > 0) {
            if (i14 == 2) {
                if (aVar.f8563f) {
                    i15 = 0;
                } else {
                    b bVar = this.f8587l;
                    i15 = bVar.f8574k;
                    if (aVar.f8566k != null && bVar.f8573j == aVar.h) {
                        i15 = 0;
                    }
                }
                int i16 = aVar2.f8562d;
                int i17 = this.f8591p;
                int i18 = i16 / i17;
                int i19 = aVar2.f8560b / i17;
                int i20 = aVar2.f8561c / i17;
                int i21 = aVar2.f8559a / i17;
                int i22 = this.f8593r;
                int i23 = (i19 * i22) + i21;
                int i24 = (i18 * i22) + i23;
                while (i23 < i24) {
                    int i25 = i23 + i20;
                    for (int i26 = i23; i26 < i25; i26++) {
                        iArr2[i26] = i15;
                    }
                    i23 += this.f8593r;
                }
            } else if (i14 == 3 && (bitmap = this.f8588m) != null) {
                int i27 = this.f8592q;
                int i28 = this.f8593r;
                bitmap.getPixels(iArr2, 0, i28, 0, 0, i28, i27);
            }
        }
        this.f8582d.position(aVar.f8565j);
        int i29 = aVar.f8561c * aVar.f8562d;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i29) {
            f fVar = (f) cVar.f264c;
            this.i = fVar == null ? new byte[i29] : (byte[]) fVar.c(i29, byte[].class);
        }
        byte[] bArr2 = this.i;
        if (this.f8583f == null) {
            this.f8583f = new short[4096];
        }
        short[] sArr = this.f8583f;
        if (this.f8584g == null) {
            this.f8584g = new byte[4096];
        }
        byte[] bArr3 = this.f8584g;
        if (this.h == null) {
            this.h = new byte[4097];
        }
        byte[] bArr4 = this.h;
        int i30 = this.f8582d.get() & 255;
        int i31 = 1;
        int i32 = 1 << i30;
        int i33 = i32 + 1;
        int i34 = i32 + 2;
        int i35 = i30 + 1;
        int i36 = (1 << i35) - 1;
        int i37 = 0;
        while (i37 < i32) {
            sArr[i37] = 0;
            bArr3[i37] = (byte) i37;
            i37++;
            i31 = i31;
        }
        int i38 = i31;
        byte[] bArr5 = this.e;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = i35;
        int i48 = i34;
        int i49 = i36;
        int i50 = -1;
        while (true) {
            if (i39 >= i29) {
                iArr2 = iArr2;
                b10 = b11;
                break;
            }
            if (i40 == 0) {
                i13 = -1;
                int i51 = this.f8582d.get() & 255;
                if (i51 > 0) {
                    ByteBuffer byteBuffer = this.f8582d;
                    byteBuffer.get(this.e, 0, Math.min(i51, byteBuffer.remaining()));
                }
                if (i51 <= 0) {
                    this.f8590o = 3;
                    b10 = 0;
                    break;
                }
                i40 = i51;
                i41 = 0;
            } else {
                sArr = sArr;
                iArr2 = iArr2;
                i13 = -1;
            }
            i43 += (bArr5[i41] & 255) << i42;
            i41++;
            i40--;
            i42 += 8;
            i48 = i48;
            int i52 = i47;
            i50 = i50;
            i45 = i45;
            while (true) {
                i42 = i42;
                if (i42 < i52) {
                    i47 = i52;
                    b11 = 0;
                    break;
                }
                int i53 = i43 & i49;
                i43 >>= i52;
                i42 -= i52;
                if (i53 == i32) {
                    i52 = i35;
                    i48 = i34;
                    i49 = i36;
                    i42 = i42;
                    i50 = i13;
                } else {
                    if (i53 == i33) {
                        i47 = i52;
                        b11 = 0;
                        break;
                    }
                    int i54 = i52;
                    if (i50 == i13) {
                        bArr2[i44] = bArr3[i53];
                        i44++;
                        i39++;
                        i50 = i53;
                        i45 = i50;
                        i52 = i54;
                    } else {
                        if (i53 >= i48) {
                            bArr4[i46] = (byte) i45;
                            i46++;
                            s10 = i50;
                        } else {
                            s10 = i53;
                        }
                        while (s10 >= i32) {
                            bArr4[i46] = bArr3[s10];
                            i46++;
                            s10 = sArr[s10];
                        }
                        i45 = bArr3[s10] & 255;
                        byte b12 = (byte) i45;
                        bArr2[i44] = b12;
                        while (true) {
                            i44++;
                            i39++;
                            if (i46 <= 0) {
                                break;
                            }
                            i46--;
                            bArr2[i44] = bArr4[i46];
                        }
                        if (i48 < 4096) {
                            sArr[i48] = (short) i50;
                            bArr3[i48] = b12;
                            i48++;
                            if ((i48 & i49) != 0 || i48 >= 4096) {
                                i52 = i54;
                            } else {
                                i52 = i54 + 1;
                                i49 += i48;
                            }
                        } else {
                            i52 = i54;
                        }
                        i50 = i53;
                    }
                    i13 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i44, i29, b10);
        if (aVar.e || this.f8591p != i38) {
            int i55 = aVar.f8562d;
            int i56 = this.f8591p;
            int i57 = i55 / i56;
            int i58 = aVar.f8560b / i56;
            int i59 = aVar.f8561c / i56;
            int i60 = aVar.f8559a / i56;
            boolean z4 = this.f8586k == 0;
            byte[] bArr6 = this.i;
            int[] iArr3 = this.f8579a;
            Boolean bool = this.f8594s;
            int i61 = 8;
            int i62 = 0;
            int i63 = 1;
            int i64 = 0;
            while (i64 < i57) {
                if (aVar.e) {
                    if (i62 >= i57) {
                        i63++;
                        if (i63 == 2) {
                            i62 = 4;
                        } else if (i63 == 3) {
                            i61 = 4;
                            i62 = 2;
                        } else if (i63 == 4) {
                            i62 = 1;
                            i61 = 2;
                        }
                    }
                    i = i62 + i61;
                } else {
                    i = i62;
                    i62 = i64;
                }
                int i65 = i62 + i58;
                int i66 = i57;
                boolean z10 = i56 == 1;
                if (i65 < this.f8592q) {
                    int i67 = this.f8593r;
                    int i68 = i65 * i67;
                    int i69 = i68 + i60;
                    int i70 = i69 + i59;
                    int i71 = i68 + i67;
                    if (i71 < i70) {
                        i70 = i71;
                    }
                    i10 = i56;
                    int i72 = i64 * i56 * aVar.f8561c;
                    int[] iArr4 = this.f8585j;
                    if (z10) {
                        int i73 = i69;
                        while (i73 < i70) {
                            int i74 = i73;
                            int i75 = iArr3[bArr6[i72] & 255];
                            if (i75 != 0) {
                                iArr4[i74] = i75;
                            } else if (z4 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i10;
                            i73 = i74 + 1;
                        }
                    } else {
                        int i76 = ((i70 - i69) * i10) + i72;
                        int i77 = i69;
                        while (i77 < i70) {
                            int i78 = i70;
                            int i79 = aVar.f8561c;
                            int i80 = i77;
                            int i81 = i72;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            int i86 = 0;
                            while (true) {
                                if (i81 >= this.f8591p + i72) {
                                    i11 = i59;
                                    break;
                                }
                                byte[] bArr7 = this.i;
                                i11 = i59;
                                if (i81 >= bArr7.length || i81 >= i76) {
                                    break;
                                }
                                int i87 = this.f8579a[bArr7[i81] & 255];
                                if (i87 != 0) {
                                    i82 += (i87 >> 24) & 255;
                                    i83 += (i87 >> 16) & 255;
                                    i84 += (i87 >> 8) & 255;
                                    i85 += i87 & 255;
                                    i86++;
                                }
                                i81++;
                                i59 = i11;
                            }
                            int i88 = i72 + i79;
                            int i89 = i88;
                            while (i89 < this.f8591p + i88) {
                                byte[] bArr8 = this.i;
                                int i90 = i88;
                                if (i89 >= bArr8.length || i89 >= i76) {
                                    break;
                                }
                                int i91 = this.f8579a[bArr8[i89] & 255];
                                if (i91 != 0) {
                                    i82 += (i91 >> 24) & 255;
                                    i83 += (i91 >> 16) & 255;
                                    i84 += (i91 >> 8) & 255;
                                    i85 += i91 & 255;
                                    i86++;
                                }
                                i89++;
                                i88 = i90;
                            }
                            int i92 = i86 == 0 ? 0 : ((i82 / i86) << 24) | ((i83 / i86) << 16) | ((i84 / i86) << 8) | (i85 / i86);
                            if (i92 != 0) {
                                iArr4[i80] = i92;
                            } else if (z4 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i72 += i10;
                            i77 = i80 + 1;
                            i70 = i78;
                            i59 = i11;
                        }
                    }
                    i64++;
                    i62 = i;
                    i57 = i66;
                    i58 = i58;
                    i56 = i10;
                    i59 = i59;
                } else {
                    i10 = i56;
                }
                i64++;
                i62 = i;
                i57 = i66;
                i58 = i58;
                i56 = i10;
                i59 = i59;
            }
            if (this.f8594s == null) {
                this.f8594s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i93 = aVar.f8562d;
            int i94 = aVar.f8560b;
            int i95 = aVar.f8561c;
            int i96 = aVar.f8559a;
            byte b13 = this.f8586k == 0 ? (byte) 1 : b10;
            byte[] bArr9 = this.i;
            int[] iArr5 = this.f8579a;
            byte b14 = -1;
            for (int i97 = b10; i97 < i93; i97++) {
                int i98 = this.f8593r;
                int i99 = (i97 + i94) * i98;
                int i100 = i99 + i96;
                int i101 = i100 + i95;
                int i102 = i99 + i98;
                if (i102 < i101) {
                    i101 = i102;
                }
                int i103 = aVar.f8561c * i97;
                while (i100 < i101) {
                    byte b15 = bArr9[i103];
                    int i104 = b15 & 255;
                    if (i104 != b14) {
                        int i105 = iArr5[i104];
                        if (i105 != 0) {
                            this.f8585j[i100] = i105;
                        } else {
                            b14 = b15;
                        }
                    }
                    i103++;
                    i100++;
                }
            }
            Boolean bool2 = this.f8594s;
            this.f8594s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f8594s != null || b13 == 0 || b14 == -1));
        }
        if (this.f8589n && ((i12 = aVar.f8564g) == 0 || i12 == 1)) {
            if (this.f8588m == null) {
                this.f8588m = a();
            }
            Bitmap bitmap3 = this.f8588m;
            int i106 = this.f8592q;
            int i107 = this.f8593r;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i107, 0, 0, i107, i106);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapA = a();
        int i108 = this.f8592q;
        int i109 = this.f8593r;
        bitmapA.setPixels(iArr, 0, i109, 0, 0, i109, i108);
        return bitmapA;
    }
}
