package app.namso_gen.spacehowen.data;

import androidx.emoji2.text.g;
import app.namso_gen.spacehowen.data.NotesDatabase_Impl;
import i3.h;
import i3.k;
import i3.n;
import ic.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jc.e;
import jc.r;
import ub.i;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class NotesDatabase_Impl extends NotesDatabase {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f1311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f1312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f1313t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i f1314u;

    public NotesDatabase_Impl() {
        final int i = 0;
        this.f1311r = new i(new a(this) { // from class: i3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotesDatabase_Impl f5182b;

            {
                this.f5182b = this;
            }

            @Override // ic.a
            public final Object a() {
                switch (i) {
                    case 0:
                        return new h(this.f5182b);
                    case 1:
                        return new n(this.f5182b);
                    case 2:
                        return new e(this.f5182b);
                    default:
                        return new r(this.f5182b);
                }
            }
        });
        final int i10 = 1;
        this.f1312s = new i(new a(this) { // from class: i3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotesDatabase_Impl f5182b;

            {
                this.f5182b = this;
            }

            @Override // ic.a
            public final Object a() {
                switch (i10) {
                    case 0:
                        return new h(this.f5182b);
                    case 1:
                        return new n(this.f5182b);
                    case 2:
                        return new e(this.f5182b);
                    default:
                        return new r(this.f5182b);
                }
            }
        });
        final int i11 = 2;
        this.f1313t = new i(new a(this) { // from class: i3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotesDatabase_Impl f5182b;

            {
                this.f5182b = this;
            }

            @Override // ic.a
            public final Object a() {
                switch (i11) {
                    case 0:
                        return new h(this.f5182b);
                    case 1:
                        return new n(this.f5182b);
                    case 2:
                        return new e(this.f5182b);
                    default:
                        return new r(this.f5182b);
                }
            }
        });
        final int i12 = 3;
        this.f1314u = new i(new a(this) { // from class: i3.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotesDatabase_Impl f5182b;

            {
                this.f5182b = this;
            }

            @Override // ic.a
            public final Object a() {
                switch (i12) {
                    case 0:
                        return new h(this.f5182b);
                    case 1:
                        return new n(this.f5182b);
                    case 2:
                        return new e(this.f5182b);
                    default:
                        return new r(this.f5182b);
                }
            }
        });
    }

    @Override // y1.v
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // y1.v
    public final y1.i e() {
        return new y1.i(this, new LinkedHashMap(), new LinkedHashMap(), "notes", "notifications", "checker_batches", "temp_mail_history");
    }

    @Override // y1.v
    public final g f() {
        return new k(this);
    }

    @Override // y1.v
    public final Set j() {
        return new LinkedHashSet();
    }

    @Override // y1.v
    public final LinkedHashMap k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e eVarA = r.a(h.class);
        q qVar = q.f9297a;
        linkedHashMap.put(eVarA, qVar);
        linkedHashMap.put(r.a(n.class), qVar);
        linkedHashMap.put(r.a(i3.e.class), qVar);
        linkedHashMap.put(r.a(i3.r.class), qVar);
        return linkedHashMap;
    }

    @Override // app.namso_gen.spacehowen.data.NotesDatabase
    public final i3.e s() {
        return (i3.e) this.f1313t.getValue();
    }

    @Override // app.namso_gen.spacehowen.data.NotesDatabase
    public final h t() {
        return (h) this.f1311r.getValue();
    }

    @Override // app.namso_gen.spacehowen.data.NotesDatabase
    public final n u() {
        return (n) this.f1312s.getValue();
    }

    @Override // app.namso_gen.spacehowen.data.NotesDatabase
    public final i3.r v() {
        return (i3.r) this.f1314u.getValue();
    }
}
