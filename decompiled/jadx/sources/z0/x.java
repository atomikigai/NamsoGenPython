package z0;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ac.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f10937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f10938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileOutputStream f10939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileOutputStream f10940d;
    public /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f10941f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10942r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, ac.c cVar) {
        super(cVar);
        this.f10941f = yVar;
    }

    @Override // ac.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f10942r |= Integer.MIN_VALUE;
        return this.f10941f.j(null, this);
    }
}
