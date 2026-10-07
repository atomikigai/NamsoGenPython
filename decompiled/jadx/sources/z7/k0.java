package z7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f11224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f11226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11227d;
    public final Map e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f11228f;

    public k0(l0 l0Var, String str, URL url, byte[] bArr, Map map, j0 j0Var) {
        this.f11228f = l0Var;
        com.google.android.gms.common.internal.i0.e(str);
        this.f11224a = url;
        this.f11225b = bArr;
        this.f11226c = j0Var;
        this.f11227d = str;
        this.e = map;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:84:0x0175  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0105: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:262), block:B:52:0x0103 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0108: MOVE (r12 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:265), block:B:53:0x0107 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map map;
        IOException iOException;
        int responseCode;
        Map map2;
        Throwable th;
        Map map3;
        Map map4;
        InputStream inputStream;
        String str = this.f11227d;
        l0 l0Var = this.f11228f;
        a1 a1Var = (a1) l0Var.f159a;
        a1 a1Var2 = (a1) l0Var.f159a;
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.g();
        int i = 0;
        OutputStream outputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = this.f11224a.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            a1Var2.getClass();
            httpURLConnection.setConnectTimeout(60000);
            a1Var2.getClass();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.e;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f11225b;
                if (bArr != null) {
                    l0 l0Var2 = l0Var.f11411b.f11512r;
                    z2.D(l0Var2);
                    byte[] bArrM = l0Var2.M(bArr);
                    i0 i0Var = a1Var2.f11007t;
                    a1.f(i0Var);
                    fd.b bVar = i0Var.f11198y;
                    int length = bArrM.length;
                    bVar.c(Integer.valueOf(length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrM);
                        outputStream2.close();
                    } catch (IOException e) {
                        iOException = e;
                        responseCode = 0;
                        map2 = null;
                        outputStream = outputStream2;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                i0 i0Var2 = a1Var2.f11007t;
                                a1.f(i0Var2);
                                i0Var2.f11190f.d(i0.k(str), "Error closing HTTP compressed POST connection output stream. appId", e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z0 z0Var2 = a1Var2.f11008u;
                        a1.f(z0Var2);
                        z0Var2.l(new g0(this.f11227d, this.f11226c, responseCode, iOException, (byte[]) null, map2));
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        th = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e10) {
                                i0 i0Var3 = a1Var2.f11007t;
                                a1.f(i0Var3);
                                i0Var3.f11190f.d(i0.k(str), "Error closing HTTP compressed POST connection output stream. appId", e10);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z0 z0Var3 = a1Var2.f11008u;
                        a1.f(z0Var3);
                        z0Var3.l(new g0(this.f11227d, this.f11226c, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i10 = inputStream.read(bArr2);
                                    if (i10 <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        z0 z0Var4 = a1Var2.f11008u;
                                        a1.f(z0Var4);
                                        z0Var4.l(new g0(this.f11227d, this.f11226c, responseCode, (IOException) null, byteArray, headerFields));
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i10);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        map2 = map4;
                        iOException = e;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z0 z0Var5 = a1Var2.f11008u;
                        a1.f(z0Var5);
                        z0Var5.l(new g0(this.f11227d, this.f11226c, responseCode, iOException, (byte[]) null, map2));
                    } catch (Throwable th5) {
                        th = th5;
                        i = responseCode;
                        map = map3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        z0 z0Var6 = a1Var2.f11008u;
                        a1.f(z0Var6);
                        z0Var6.l(new g0(this.f11227d, this.f11226c, i, (IOException) null, (byte[]) null, map));
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                    map2 = null;
                    iOException = e;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    z0 z0Var7 = a1Var2.f11008u;
                    a1.f(z0Var7);
                    z0Var7.l(new g0(this.f11227d, this.f11226c, responseCode, iOException, (byte[]) null, map2));
                } catch (Throwable th6) {
                    th = th6;
                    map = null;
                    i = responseCode;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    z0 z0Var8 = a1Var2.f11008u;
                    a1.f(z0Var8);
                    z0Var8.l(new g0(this.f11227d, this.f11226c, i, (IOException) null, (byte[]) null, map));
                    throw th;
                }
            } catch (IOException e13) {
                iOException = e13;
                responseCode = 0;
                map2 = null;
            } catch (Throwable th7) {
                th = th7;
                map = null;
            }
        } catch (IOException e14) {
            iOException = e14;
            responseCode = 0;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
