package t3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f8576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f8577c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8575a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8578d = 0;

    public final boolean a() {
        return this.f8577c.f8568b != 0;
    }

    public final b b() {
        byte[] bArr;
        if (this.f8576b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f8577c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f8577c.f8571f = this.f8576b.getShort();
            this.f8577c.f8572g = this.f8576b.getShort();
            int iC = c();
            b bVar = this.f8577c;
            bVar.h = (iC & 128) != 0;
            bVar.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f8577c.f8573j = c();
            b bVar2 = this.f8577c;
            c();
            bVar2.getClass();
            if (this.f8577c.h && !a()) {
                b bVar3 = this.f8577c;
                bVar3.f8567a = e(bVar3.i);
                b bVar4 = this.f8577c;
                bVar4.f8574k = bVar4.f8567a[bVar4.f8573j];
            }
        } else {
            this.f8577c.f8568b = 1;
        }
        if (!a()) {
            boolean z4 = false;
            while (!z4 && !a() && this.f8577c.f8569c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.f8577c.f8570d = new a();
                        c();
                        int iC4 = c();
                        a aVar = this.f8577c.f8570d;
                        int i10 = (iC4 & 28) >> 2;
                        aVar.f8564g = i10;
                        if (i10 == 0) {
                            aVar.f8564g = 1;
                        }
                        aVar.f8563f = (iC4 & 1) != 0;
                        short s10 = this.f8576b.getShort();
                        if (s10 < 2) {
                            s10 = 10;
                        }
                        a aVar2 = this.f8577c.f8570d;
                        aVar2.i = s10 * 10;
                        aVar2.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb3 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            bArr = this.f8575a;
                            if (i11 >= 11) {
                                break;
                            }
                            sb3.append((char) bArr[i11]);
                            i11++;
                        }
                        if (sb3.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b10 = bArr[1];
                                    byte b11 = bArr[2];
                                    this.f8577c.getClass();
                                }
                                if (this.f8578d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    b bVar5 = this.f8577c;
                    if (bVar5.f8570d == null) {
                        bVar5.f8570d = new a();
                    }
                    bVar5.f8570d.f8559a = this.f8576b.getShort();
                    this.f8577c.f8570d.f8560b = this.f8576b.getShort();
                    this.f8577c.f8570d.f8561c = this.f8576b.getShort();
                    this.f8577c.f8570d.f8562d = this.f8576b.getShort();
                    int iC5 = c();
                    boolean z10 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    a aVar3 = this.f8577c.f8570d;
                    aVar3.e = (iC5 & 64) != 0;
                    if (z10) {
                        aVar3.f8566k = e(iPow);
                    } else {
                        aVar3.f8566k = null;
                    }
                    this.f8577c.f8570d.f8565j = this.f8576b.position();
                    c();
                    f();
                    if (!a()) {
                        b bVar6 = this.f8577c;
                        bVar6.f8569c++;
                        bVar6.e.add(bVar6.f8570d);
                    }
                } else if (iC2 != 59) {
                    this.f8577c.f8568b = 1;
                } else {
                    z4 = true;
                }
            }
            b bVar7 = this.f8577c;
            if (bVar7.f8569c < 0) {
                bVar7.f8568b = 1;
            }
        }
        return this.f8577c;
    }

    public final int c() {
        try {
            return this.f8576b.get() & 255;
        } catch (Exception unused) {
            this.f8577c.f8568b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f8578d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        int i10 = 0;
        while (true) {
            try {
                int i11 = this.f8578d;
                if (i >= i11) {
                    return;
                }
                i10 = i11 - i;
                this.f8576b.get(this.f8575a, i, i10);
                i += i10;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbD = u3.b.d(i, i10, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbD.append(this.f8578d);
                    Log.d("GifHeaderParser", sbD.toString(), e);
                }
                this.f8577c.f8568b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f8576b.get(bArr);
            iArr = new int[256];
            int i10 = 0;
            int i11 = 0;
            while (i10 < i) {
                int i12 = bArr[i11] & 255;
                int i13 = i11 + 2;
                int i14 = bArr[i11 + 1] & 255;
                i11 += 3;
                int i15 = i10 + 1;
                iArr[i10] = (i14 << 8) | (i12 << 16) | (-16777216) | (bArr[i13] & 255);
                i10 = i15;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f8577c.f8568b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.f8576b.position(Math.min(this.f8576b.position() + iC, this.f8576b.limit()));
        } while (iC > 0);
    }
}
